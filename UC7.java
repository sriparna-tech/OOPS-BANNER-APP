import java.util.HashMap;
import java.util.Map;

public class UC7 {

    // Inner class to encapsulate character patterns
    static class CharacterPattern {
        private String[] pattern;

        public CharacterPattern(String[] pattern) {
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Static inner class to manage mappings
    static class CharacterPatternMap {
        private static final Map<Character, CharacterPattern> patternMap = new HashMap<>();

        static {
            // Initialize patterns
            patternMap.put('O', new CharacterPattern(new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
            }));

            patternMap.put('P', new CharacterPattern(new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
            }));

            patternMap.put('S', new CharacterPattern(new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
            }));
        }

        public static CharacterPattern getPattern(char c) {
            return patternMap.get(c);
        }
    }

    public static void main(String[] args) {
        String word = "OOPS";

        // Render banner line by line
        for (int row = 0; row < 5; row++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                String[] pattern = CharacterPatternMap.getPattern(c).getPattern();
                line.append(pattern[row]).append("  "); // spacing
            }
            System.out.println(line);
        }
    }
}


