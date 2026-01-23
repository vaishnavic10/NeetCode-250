public class CharFrequency {
    public static void main(String[] args) {

        String str = "java";
        boolean[] visited = new boolean[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println(str.charAt(i) + " -> " + count);
        }
    }
}
