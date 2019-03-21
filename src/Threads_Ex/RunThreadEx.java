package Threads_Ex;

import java.util.Scanner;

public class RunThreadEx {

    public static void main(String[] args) {
        CreateThreadsEx threadsEx1 = new CreateThreadsEx();
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
