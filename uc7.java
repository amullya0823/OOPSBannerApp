
public class uc7 {

    static class CharacterPatternMap {

        private char character;
        private String[] pattern;
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        
        public char getCharacter() {
            return character;
        }

        public String[] getCharacterPattern() {
            return pattern;
        }
    }

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

    public static void main(String[] args) {

        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', getOPattern()),
                new CharacterPatternMap('P', getPPattern()),
                new CharacterPatternMap('S', getSPattern())
        };

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                for (CharacterPatternMap map : patterns) {

                    if (map.getCharacter() == ch) {
                        line.append(map.getCharacterPattern()[row]).append("   ");
                    }
                }
            }

            System.out.println(line);
        }
    }
}