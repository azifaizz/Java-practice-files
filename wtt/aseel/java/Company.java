package wtt.aseel.java;
class Company {
    static String companyName = "White Track";
    String name;
    int id;
    Company(String name, int id) {
        this.name = name;
        this.id = id;
    }
    void display() {
        System.out.println("Company: " + companyName);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
    public static void main(String[] args) {
        Company c = new Company("Aseel", 101);
        c.display();
    }
}