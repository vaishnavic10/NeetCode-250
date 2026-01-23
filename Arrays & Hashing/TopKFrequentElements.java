class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int MAX = 10001;
        int[][] freq = new int[MAX][2]; 

        for (int i = 0; i < MAX; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        for (int num : nums) {
            freq[num][1]++;
        }

        for (int i = 0; i < MAX - 1; i++) {
            for (int j = 0; j < MAX - i - 1; j++) {
                if (freq[j][1] < freq[j + 1][1]) {
                    
                    int[] temp = freq[j];
                    freq[j] = freq[j + 1];
                    freq[j + 1] = temp;
                }
            }
        }

        int[] result = new int[k];
        int index = 0;
        for (int i = 0; i < MAX && index < k; i++) {
            if (freq[i][1] > 0) {
                result[index++] = freq[i][0];
            }
        }

        return result;
    }
}
