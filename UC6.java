public class UC6 {

    // Static helper methods for each character
    public static String[] getO() {
        return new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    public static String[] getP() {
        return new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        };
    }

    public static String[] getS() {
        return new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        };
    }

    public static void main(String[] args) {
        // Build banner using static methods
        String[][] banner = { getO(), getO(), getP(), getS() };

        // Render banner line by line
        for (int row = 0; row < banner[0].length; row++) {
            for (String[] letter : banner) {
                System.out.print(letter[row] + "  "); // spacing between letters
            }
            System.out.println();
        }
    }
}
