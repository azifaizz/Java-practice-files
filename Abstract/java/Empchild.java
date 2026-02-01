package Abstract.java;

public class Empchild extends Empparent {

    private int annualSalary() {
        return getSalary() * 12;
    }

    public void showDetails() {
        show();
        System.out.println("Department: " + getDept());
        System.out.println("Monthly Salary: " + getSalary());
        System.out.println("Annual Salary: " + annualSalary());
    }
}

