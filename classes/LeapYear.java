public class LeapYear {

    public static boolean isLeapYear(final int year) {
        // Validation: Range
        if (year < 1) return false;
        if (year > 9999) return false;

        // Not divisible by four
        if (year % 4 != 0) return false;

        // Is century but not divisible by 400
        if (year % 100 == 0 && year % 400 != 0) return false;

        return true;
    }

    public static void main(String[] args) {
        if (isLeapYear(0) == true) {
            throw new IllegalArgumentException("Year must be greater than 1");
        }

        if (isLeapYear(10000) == true) {
            throw new IllegalArgumentException("Year must be less 10000");
        }

        if(isLeapYear(1700) == true) {
            throw new RuntimeException(1700 + " is NOT a Leap Year.");
        }

        if(isLeapYear(1800) == true) {
            throw new RuntimeException(1800 + " is NOT a Leap Year.");
        }

        if(isLeapYear(1900) == true) {
            throw new RuntimeException(1900 + " is NOT a Leap Year.");
        }

        if(isLeapYear(2100) == true) {
            throw new RuntimeException(2100 + " is NOT a Leap Year.");
        }

        if(isLeapYear(2200) == true) {
            throw new RuntimeException(2200 + " is NOT a Leap Year.");
        }

        if(isLeapYear(2300) == true) {
            throw new RuntimeException(2300 + " is NOT a Leap Year.");
        }

        if(isLeapYear(2500) == true) {
            throw new RuntimeException(2500 + " is NOT a Leap Year.");
        }

        if(isLeapYear(2600) == true) {
            throw new RuntimeException(2600 + " is NOT a Leap Year.");
        }

        if (isLeapYear(1600) == false) {
            throw new RuntimeException(1600 + " IS a Leap Year");
        }

        if (isLeapYear(2000) == false) {
            throw new RuntimeException(2000 + " IS a Leap Year");
        }

        if (isLeapYear(2400) == false) {
            throw new RuntimeException(2400 + " IS a Leap Year");
        }

        System.out.println("All Good!. All tests passed.");
    }
}