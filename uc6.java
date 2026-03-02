public class uc6 {
    public static String[] getOPattern() {
        return new String[]{
                String.join("", "*********"),
                String.join("", "*       *"),
                String.join("", "*       *"),
                String.join("", "*       *"),
                String.join("", "*       *"),
                String.join("", "*       *"),
                String.join("", "*********")
        };
    }

    public static String[] getPPattern() {
        return new String[]{
                String.join("", "*********"),
                String.join("", "*       *"),
                String.join("", "*       *"),
                String.join("", "*********"),
                String.join("", "*        "),
                String.join("", "*        "),
                String.join("", "*        ")
        };
    }

    public static String[] getSPattern() {
        return new String[]{
                String.join("", "*********"),
                String.join("", "*        "),
                String.join("", "*        "),
                String.join("", "*********"),
                String.join("", "        *"),
                String.join("", "        *"),
                String.join("", "*********")
        };
    }

    public static void main(String[] args) {

        String[] O1 = getOPattern();
        String[] O2 = getOPattern();  
        String[] P  = getPPattern();
        String[] S  = getSPattern();

        String[] banner = new String[]{
                O1[0] + "   " + O2[0] + "   " + P[0] + "   " + S[0],
                O1[1] + "   " + O2[1] + "   " + P[1] + "   " + S[1],
                O1[2] + "   " + O2[2] + "   " + P[2] + "   " + S[2],
                O1[3] + "   " + O2[3] + "   " + P[3] + "   " + S[3],
                O1[4] + "   " + O2[4] + "   " + P[4] + "   " + S[4],
                O1[5] + "   " + O2[5] + "   " + P[5] + "   " + S[5],
                O1[6] + "   " + O2[6] + "   " + P[6] + "   " + S[6]
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}