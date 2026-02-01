package Collections;

public class Mclass {

    int id;
    String name;
    int marks;

    Mclass(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(id + " | " + name + " | " + marks);
    }
}
