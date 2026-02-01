package Abstractques;

class Creditcard implements Pay {
    public void pay1(double amount) {
        System.out.println("Paid using Creditcard: " + amount);
    }
}
