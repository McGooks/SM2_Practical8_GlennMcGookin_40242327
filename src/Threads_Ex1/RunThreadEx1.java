package Threads_Ex1;

import java.util.Scanner;

public class RunThreadEx1 {

    public static void main(String[] args) {
        CreateThreadsEx1 threadsEx1 = new CreateThreadsEx1();
        Thread newThread = new Thread(threadsEx1);
        newThread.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Scanner input = new Scanner(System.in);
        System.out.println("To reverse the countdown please press the letter A");
        while(true){
            String in = input.nextLine();
            if (in.equalsIgnoreCase("A")){
                newThread.interrupt();
                try {
                    Thread.sleep(12000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
        System.out.println("Program Terminated.");
    }

}
