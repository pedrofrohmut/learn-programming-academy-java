package classes;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(
        final double number1,
        final double number2
    ) {
        final long num1Modified = (long) (number1 * 1000);
        final long num2Modified = (long) (number2 * 1000);

        return num1Modified == num2Modified;
    }

    public static void main(String[] args) {
        if (areEqualByThreeDecimalPlaces(-3.1756, -3.175) == false) {
            throw new RuntimeException(-3.1756 + " and " + -3.175 + " should be considered equals.");
        }

        if (areEqualByThreeDecimalPlaces(3.175, 3.176) == true) {
            throw new RuntimeException(3.175 + " and " + 3.176 + " should NOT be considered equals.");
        }

        if (areEqualByThreeDecimalPlaces(3.0, 3.0) == false) {
            throw new RuntimeException(3.0 + " and " + 3.0 + " should be considered equals.");
        }

        if (areEqualByThreeDecimalPlaces(-3.123, 3.123) == true) {
            throw new RuntimeException(-3.123 + " and " + 3.123 + " should NOT be considered equals.");
        }

        System.out.println("All Good!. All tests passed.");
    }
}