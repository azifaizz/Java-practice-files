package wtt.aseel.java;

public class NearestLift {
    public static void main(String[] args) {
        int passengerFloor = 5;
        int lift1 = 9;
        int lift2 = 5;

        int dist1 = Math.abs(passengerFloor - lift1);
        int dist2 = Math.abs(passengerFloor - lift2);

        if (dist1 < dist2) {
            System.out.println("Lift 1 is nearer to the passenger.");
        } else if (dist2 < dist1) {
            System.out.println("Lift 2 is nearer to the passenger.");
        } else {
            System.out.println("Both lifts are at the same distance from the passenger.");
        }
    }
}
