package multithreading;

public class Ex3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Ex3());
        thread.start();
        for (int i = 20; i >0; i--) {
            System.out.println(i);
        }
//        Thread thread3 = new Thread(new MyThread3());
//        Thread thread4 = new Thread(new MyThread4());
//        thread3.start();
//        thread4.start();
    }
}
//
//class MyThread3 implements Runnable {
//    public void run() {
//        for (int i = 0; i <= 100; i++) {
//            System.out.println(i);
//        }
//    }
//}
//
//
//class MyThread4 implements Runnable {
//    @Override
//    public void run() {
//        for (int i = 100; i > 0; i--) {
//            System.out.println(i);
//        }
//    }
//}
