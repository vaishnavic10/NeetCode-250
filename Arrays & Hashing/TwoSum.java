public class Main {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                int j = map.get(complement);
                return new int[] {Math.min(i, j), Math.max(i, j)};
            }

            map.put(nums[i], i);
        }

        return new int[] {}; 
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6};
        int target = 7;

        int[] result = twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
