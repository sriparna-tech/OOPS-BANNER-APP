public class BannerAppUC5 {
    public static void main(String[] args) {
        // Declare and initialize array in one step
        String[] bannerLines = {
            String.join("", new String[]{"*", "*", "*", "*", "*", "*", "*"}),
            String.join("", new String[]{"*", " ", " ", " ", " ", " ", "*"}),
            String.join("", new String[]{"*", " ", "W", "E", "L", "C", "*"}),
            String.join("", new String[]{"*", " ", "T", "O", " ", " ", "*"}),
            String.join("", new String[]{"*", " ", "J", "A", "V", "A", "*"}),
            String.join("", new String[]{"*", " ", " ", " ", " ", " ", "*"}),
            String.join("", new String[]{"*", "*", "*", "*", "*", "*", "*"})
        };

        // Enhanced for loop to display banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}

