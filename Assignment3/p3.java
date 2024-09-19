// package Assignment3;

public class p3 {
    public static void main(String[] args) {
        try {
            throw new UDE("User Defined Exception");
        } catch (UDE e) {
            e.printStackTrace();
        }
    }
}

class UDE extends Exception {
    UDE(String message) {
        super(message);
    }
}
