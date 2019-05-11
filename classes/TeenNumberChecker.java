package classes;

public class TeenNumberChecker {

    public static boolean isTeen(final int age) {
        if (age < 13) return false;
        if (age > 19) return false;
        return true;
    }

    public static boolean hasTeen(
        final int age1,
        final int age2,
        final int age3
    ) {
        final boolean age1IsTeen = isTeen(age1);
        final boolean age2IsTeen = isTeen(age2);
        final boolean age3IsTeen = isTeen(age3);

        return age1IsTeen || age2IsTeen || age3IsTeen;
    }

    public static void main(String[] args) {
        if (hasTeen(9, 99, 19) == false) {
            throw new RuntimeException("19 is in range should return true.");
        }

        if (hasTeen(23, 15, 42) == false) {
            throw new RuntimeException("15 is in range should return true.");
        }

        if (hasTeen(22, 23, 34) == true) {
            throw new RuntimeException("No teens here. Should return false.");
        }

        if (hasTeen(13, 50, 50) == false) {
            throw new RuntimeException("13 is in range should return true.");
        }

        if (hasTeen(50, 13, 50) == false) {
            throw new RuntimeException("13 is in range should return true.");
        }

        if (hasTeen(50, 50, 13) == false) {
            throw new RuntimeException("13 is in range should return true.");
        }

        if (hasTeen(19, 50, 50) == false) {
            throw new RuntimeException("19 is in range should return true.");
        }
        
        if (hasTeen(50, 19, 50) == false) {
            throw new RuntimeException("19 is in range should return true.");
        }

        if (hasTeen(50, 50, 19) == false) {
            throw new RuntimeException("19 is in range should return true.");
        }

        if (hasTeen(14, 50, 50) == false) {
            throw new RuntimeException("14 is in range should return true.");
        }
        
        if (hasTeen(15, 50, 50) == false) {
            throw new RuntimeException("15 is in range should return true.");
        }

        if (hasTeen(16, 50, 50) == false) {
            throw new RuntimeException("16 is in range should return true.");
        }

        if (hasTeen(17, 50, 50) == false) {
            throw new RuntimeException("17 is in range should return true.");
        }

        if (hasTeen(18, 50, 50) == false) {
            throw new RuntimeException("18 is in range should return true.");
        }

        if (isTeen(9) == true) {
            throw new RuntimeException("9 is not teen");
        }

        if (isTeen(13) == false) {
            throw new RuntimeException("13 is teen");
        }

        if (isTeen(15) == false) {
            throw new RuntimeException("15 is teen");
        }

        if (isTeen(19) == false) {
            throw new RuntimeException("19 is teen");
        }

        if (isTeen(23) == true) {
            throw new RuntimeException("23 is not teen");
        }

        System.out.println("All Good!. All tests passed.");
    }
}