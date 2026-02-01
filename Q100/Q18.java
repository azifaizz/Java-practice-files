public class Q18 {

    static void signalAction(String color) {

        if (color.equalsIgnoreCase("red")) {
            System.out.println("Stop");
        } 
        else if (color.equalsIgnoreCase("green")) {
            System.out.println("Go");
        } 
        else if (color.equalsIgnoreCase("yellow")) {
            System.out.println("Slow");
        } 
        else {
            System.out.println("Invalid signal");
        }
    }

    public static void main(String[] args) {
        signalAction("red");
        signalAction("green");
        signalAction("yellow");
    }
}
