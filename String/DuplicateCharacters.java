public class DuplicateCharacters {
    public static void main(String[] args) {

        String str = "programming";
        boolean[] visited = new boolean[str.length()];

        System.out.print("Duplicate characters: ");

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

            if (count > 1)
                System.out.print(str.charAt(i) + " ");
        }
    }
}
