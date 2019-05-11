package classes;

public class EqualSumChecker {

    public static boolean hasEqualSum(
        final int num1,
        final int num2,
        final int sumOfNum1AndNum2
    ) {
        return num1 + num2 == sumOfNum1AndNum2;
    }

    public static void main(String[] args) {
        if (hasEqualSum(1, 1, 1) == true) {
            throw new RuntimeException("1, 1, 1 should return false. 1 + 1 = 2 not 1");
        }

        if (hasEqualSum(1, 1, 2) == false) {
            throw new RuntimeException("1, 1, 2 should return true 1 + 1 = 2");
        }

        if (hasEqualSum(1, -1, 0) == false) {
            throw new RuntimeException("1, -1, 0 should return true. 1 + (-1) = 0");
        }

        System.out.println("All Good!. All tests passed.");
    }
}