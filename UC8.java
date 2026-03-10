import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Centralized map for character patterns
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        patternMap.put('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        patternMap.put('P', new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        });

        patternMap.put('S', new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        });
    }

    // Function to render any word using the map
    public static void renderBanner(String word) {
        int rows = patternMap.get(word.charAt(0)).length; // assume all patterns same height

        for (int row = 0; row < rows; row++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.get(c);
                if (pattern != null) {
                    line.append(pattern[row]).append("  "); // spacing
                }
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        renderBanner("OOPS");
    }
}
