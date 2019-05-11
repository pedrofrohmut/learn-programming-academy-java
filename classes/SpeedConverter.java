package classes;

public class SpeedConverter {

  // write your code here
  public static long toMilesPerHour(final double kilometersPerHour) {
    if (kilometersPerHour < 0) {
      return -1;
    }

    return Math.round(kilometersPerHour / 1.609);
  }

  public static void printConversion(final double kilometersPerHour) {
    if (kilometersPerHour < 0) {
      System.out.println("Invalid Value");
      return;
    }

    final long milesPerHour = toMilesPerHour(kilometersPerHour);
    System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
  }

  public static void main(String[] args) {
    System.out.format("To Miles 1.5 = %d %n", toMilesPerHour(1.5));
    System.out.format("To Miles 10.25 = %d %n", toMilesPerHour(10.25));
    System.out.format("To Miles -5.6 = %d %n", toMilesPerHour(-5.6));
    System.out.format("To Miles 25.42 = %d %n", toMilesPerHour(25.42));
    System.out.format("To Miles 75.114 = %d %n", toMilesPerHour(75.114));

    printConversion(1.5);
    printConversion(10.25);
    printConversion(-5.6);
    printConversion(25.42);
    printConversion(75.114);
  }
}