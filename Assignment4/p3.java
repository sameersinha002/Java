// package Assignment4;

class TestThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
    }
}

public class p3 {
    public static void main(String[] args) {
        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        t1.start();
    }
}
