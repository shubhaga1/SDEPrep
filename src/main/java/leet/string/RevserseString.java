package leet.string;

public class RevserseString {
    public static void main(String[] args) {
        String text = "   I   am champion and i have an eye of     a tiger  ";
        System.out.println(text);
        System.out.println(reverseString(text));

    }

    private static StringBuffer reverseString(String text) {
        int i = text.length() - 1;
        StringBuffer sb = new StringBuffer();
        while (i >= 0) {
            while (i >= 0 && text.charAt(i) == ' ') i--;
            int j = i;
            if (i < 0) break;
            while ((i >= 0) && (' ' != text.charAt(i))) i--;
            if (sb.length() <= 0) {
                sb.append(text.substring(i + 1, j + 1));
            } else {
                sb.append(' ');
                sb.append(text.substring(i + 1, j + 1));
            }
        }
        return sb;
    }

}
