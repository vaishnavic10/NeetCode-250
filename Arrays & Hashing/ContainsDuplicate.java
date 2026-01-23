class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true; 
            }
            set.add(num);
        }

        return false; 
    }

    public void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 3};

        boolean result = solution.hasDuplicate(nums);
        System.out.println(result); 
    }
}
