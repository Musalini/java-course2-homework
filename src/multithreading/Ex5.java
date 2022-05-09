package multithreading;

public class Ex5 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("myThread");
        myThread5.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Name of thread: " + myThread5.getName() +
                ", Priority: " + myThread5.getPriority());

    }
}

class MyThread5 extends Thread {
    @Override
    public void run() {
        System.out.println("Hello");
    }
}
