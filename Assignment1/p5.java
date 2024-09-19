// package Assignment1;

public class p5 {
    public static void main(String[] args) {
        StaticObject obj = new StaticObject();
        StaticObject.sMethod();
        obj.incSvar();
        
    }
}

class StaticObject {
    static int svar = 10;

    void incSvar() {
        svar++;
        System.out.println(svar);
    }

    static {
        svar = 0;
        System.out.println("This is a Static block, It'll run even before constructor");
        System.out.println(svar);
    }

    static void sMethod() {
        System.out.println("Static method can be accessed without an object");
    }
}