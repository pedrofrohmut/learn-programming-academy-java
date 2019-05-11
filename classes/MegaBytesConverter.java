package classes;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(final int kilobytes) {
        if (kilobytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        final long mb = (long) Math.floor(kilobytes / 1024);
        final long remainingKb = kilobytes - (mb * 1024);
        System.out.println(kilobytes + " KB = " + mb + " MB and " + remainingKb + " KB");
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
}