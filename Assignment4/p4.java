// package Assignment4;

class Storage {
    private int count;
    private boolean printed = true;

    void inc() {
        this.count++;
    }

    int getCount() {
        return this.count;
    }

    boolean isPrinted() {
        return printed;
    }

    void setPrinted(boolean printed) {
        this.printed = printed;
    }
}

class Counter extends Thread {
    Storage st;

    Counter(Storage st) {
        this.st = st;
    }

    public void run() {
        synchronized (st) {
            for (int i = 0; i < 10; i++) {
                while (!st.isPrinted()) {
                    try {
                        st.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                st.inc();
                System.out.printf("%s - %d\n", this.getName(), st.getCount());
                st.setPrinted(false);
                st.notify();
            }
        }
    }

}

class Printer extends Thread {
    Storage st;

    Printer(Storage st) {
        this.st = st;
    }

    public void run() {
        synchronized (st) {
            for (int i = 0; i < 10; i++) {
                while (st.isPrinted()) {
                    try {
                        st.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.printf("%s - %d\n", this.getName(), st.getCount());
                st.setPrinted(true);
                st.notify();
            }
        }
    }
}

public class p4 {
    public static void main(String[] args) {
        Storage st = new Storage();
        Counter c = new Counter(st);
        Printer p = new Printer(st);
        p.setName("Printer");
        c.setName("Counter");

        c.start();
        p.start();
    }
}
