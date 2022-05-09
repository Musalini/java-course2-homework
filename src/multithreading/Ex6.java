package multithreading;

public class Ex6 implements Runnable {
    @Override
    public void run() {
        System.out.println("Method run. Thread name = " +
                Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Ex6());
        thread1.start();
        System.out.println("Method main. Thread name = " +
                Thread.currentThread().getName());
    }
    }


