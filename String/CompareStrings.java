public class CompareStrings {
    public static void main(String[] args) {

        String s1 = "java";
        String s2 = "java";

        boolean isEqual = true;

        if (s1.length() != s2.length()) {
            isEqual = false;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        }

        if (isEqual)
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");
    }
}
