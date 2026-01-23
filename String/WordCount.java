public class WordCount {
    public static void main(String[] args) {

        String str = "Java is very easy";
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }

        if (str.length() > 0)
            count++;

        System.out.println("Word count: " + count);
    }
}
