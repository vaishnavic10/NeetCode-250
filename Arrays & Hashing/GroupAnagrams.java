class Solution {
    public java.util.List<java.util.List<String>> groupAnagrams(String[] strs) {
        java.util.Map<String, java.util.List<String>> map = new java.util.HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            java.util.Arrays.sort(chars);
            String key = new String(chars);

            map.computeIfAbsent(key, k -> new java.util.ArrayList<>()).add(word);
        }

        return new java.util.ArrayList<>(map.values());
    }
}