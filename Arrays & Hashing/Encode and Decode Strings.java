public class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String s : strs) {
            encoded.append(s.length()).append('#').append(s);
        }
        return encoded.toString();
    }

    public List<String> decode(String s) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = s.indexOf('#', i);
            int length = Integer.parseInt(s.substring(i, j));
            i = j + 1;
            decoded.add(s.substring(i, i + length));
            i += length;
        }
        return decoded;
    }

    public void main(String[] args) {
        Solution codec = new Solution();

        List<String> input1 = Arrays.asList("neet", "code", "love", "you");
        String encoded1 = codec.encode(input1);
        List<String> decoded1 = codec.decode(encoded1);

        System.out.println("Encoded: " + encoded1);
        System.out.println("Decoded: " + decoded1);

        List<String> input2 = Arrays.asList("we", "say", ":", "yes");
        String encoded2 = codec.encode(input2);
        List<String> decoded2 = codec.decode(encoded2);

        System.out.println("Encoded: " + encoded2);
        System.out.println("Decoded: " + decoded2);
    }
}
