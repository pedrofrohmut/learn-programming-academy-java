package classes;

public class BarkingDog {

    public static boolean shouldWakeUp(
        final boolean isBarking, 
        final int hourOfTheDay
    ) {
        if (hourOfTheDay < 0) return false;
        if (hourOfTheDay > 23) return false;

        if (!isBarking) return false;

        if (hourOfTheDay >= 8 && hourOfTheDay <= 22) return false;

        return true;
    }

    public static void main(String[] args) {
        if (shouldWakeUp(true, -1) == true) {
            throw new IllegalArgumentException(-1 + " is not a valid range for hour");
        }

        if (shouldWakeUp(true, 24) == true) {
            throw new IllegalArgumentException(24 + " is not a valid range for hour");
        }

        if (shouldWakeUp(true, 7) == false) {
            throw new RuntimeException("the dog is barking at " + 7 + " you were supposed to be awake");
        }

        if (shouldWakeUp(true, 23) == false) {
            throw new RuntimeException("the dog is barking at " + 23 + " you were supposed to be awake");
        }
        
        if (shouldWakeUp(false, 7) == true) {
            throw new RuntimeException("the dog is NOT barking at " + 7 + " you were supposed to be sleeping");
        }

        if (shouldWakeUp(false, 23) == true) {
            throw new RuntimeException("the dog is NOT barking at " + 23 + " you were supposed to be sleeping");
        }

        System.out.println("All Good!. All tests passed.");
    }
}
