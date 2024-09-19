// package Assignment2;

public class p2 {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.absFunc();
    }
}

abstract class AbstractClass {
    abstract void absFunc();
}

class ChildClass extends AbstractClass {
    void absFunc() {
        System.out.println("Needs to be implemented in Child Class");
    }
}