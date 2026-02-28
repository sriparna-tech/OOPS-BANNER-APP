public class UC4 {
    public static void main(String[] args) {
        // Store each line of the banner in a String array
        String[] bannerLines = {
            "*****   *****   *****   *****",
            "*       *   *   *   *   *   *",
            "*       *   *   *   *   *   *",
            "*****   *****   *****   *****",
            "*       *   *       *       *",
            "*       *   *       *       *",
            "*****   *   *       *   *****"
        };

        // Use an enhanced for-loop to print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
