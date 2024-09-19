// package Assignment4;

class MyThread extends Thread {
    static int a = 0;

    public void run() {
        System.out.println(a++);
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}
