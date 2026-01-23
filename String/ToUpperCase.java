public class ToUpperCase {
    public static void main(String[] args) {

        String str = "java";
        String upper = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z')
                upper = upper + (char)(ch - 32);
            else
                upper = upper + ch;
        }

        System.out.println(upper);
    }
}
