// package Assignment3;

public class p2 {
    public static void main(String[] args) {
        M m = new M();
        try {
            System.out.println(m.div(10, 0));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}

class M {
    int div(int a, int b) throws ArithmeticException {
        return a / b;
    }
}