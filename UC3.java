public class UC3 {
    public static void main(String[] args) {
        // Each line of the banner is created using String.join()
        String line1 = String.join(" ", "O", "O", "O", "P", "S");
        String line2 = String.join(" ", "O", "   ", "O", "P", "   ");
        String line3 = String.join(" ", "O", "O", "O", "P", "S");
        String line4 = String.join(" ", "O", "   ", "O", "P", "   ");
        String line5 = String.join(" ", "O", "O", "O", "P", "S");

        // Print the banner
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}
