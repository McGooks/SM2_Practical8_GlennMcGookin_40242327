package Threads_Ex1;

public class CreateThreadsEx1 implements Runnable {

    @Override
    public void run() {
        boolean exit = true;
        do {
            try {
                for (int i = 10; i > 0; i--) {
                    System.out.println(i);
                    Thread.sleep(1000);
                }
                exit = false;
            } catch (InterruptedException Ex) {
                System.out.flush();
            }
        } while (exit);

        boolean sleep = true;
        while (sleep) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                sleep = false;
            }
        }

        exit = true;

        do {
            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                    Thread.sleep(1000);
                }
                exit = false;
            } catch (InterruptedException Ex) {
                System.out.flush();
            }
        } while (exit);
    }
}
