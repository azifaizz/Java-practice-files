package oops.java;

public class Child4 extends Parent4 implements Teacher1, Teacher2 {

    public void write() {
        System.out.println("Child is writing");
    }

    public void draw() {
        System.out.println("Child is drawing");
    }

    void study() {
        System.out.println("Child is studying");
    }
}
