// package Assignment2;

public class p3 {
    public static void main(String[] args) {
        C c = new C();
        c.show();
    }
}

class A {
    int x = 10;
}

class B extends A {
    B() {
        System.out.println("Class B " + x);
    }
}

class C extends B {
    void show() {
        System.out.println("Class C " + x);
    }
}
