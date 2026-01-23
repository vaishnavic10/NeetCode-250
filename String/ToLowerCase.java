public class ToLowerCase {
    public static void main(String[] args) {

        String str = "JAVA";
        String lower = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z')
                lower = lower + (char)(ch + 32);
            else
                lower = lower + ch;
        }

        System.out.println(lower);
    }
}
