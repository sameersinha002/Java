// package Assignment4;

class MyThread implements Runnable {
    static int a = 0;

    public void run() {
        System.out.println(a++);
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        new Thread(new MyThread()).start();
        new Thread(new MyThread()).start();
    }
}
