import java.util.HashMap;
import java.util.Map;

public class uc8 {

    /**
     * Method to build O pattern
     */
    public static String[] getOPattern() {
        return new String[]{
                "*********",
                "*       *",
                "*       *",
                "*       *",
                "*       *",
                "*       *",
                "*********"
        };
    }

    /**
     * Method to build P pattern
     */
    public static String[] getPPattern() {
        return new String[]{
                "*********",
                "*       *",
                "*       *",
                "*********",
                "*        ",
                "*        ",
                "*        "
        };
    }

    /**
     * Method to build S pattern
     */
    public static String[] getSPattern() {
        return new String[]{
                "*********",
                "*        ",
                "*        ",
                "*********",
                "        *",
                "        *",
                "*********"
        };
    }

    /**
     * Method to build the HashMap of patterns
     */
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', getOPattern());
        map.put('P', getPPattern());
        map.put('S', getSPattern());

        return map;
    }

    /**
     * Method to display banner message
     */
    public static void displayBanner(String message, Map<Character, String[]> patterns) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = patterns.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("   ");
                }
            }

            System.out.println(line);
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        Map<Character, String[]> patterns = buildCharacterPatterns();

        String word = "OOPS";

        displayBanner(word, patterns);
    }
}