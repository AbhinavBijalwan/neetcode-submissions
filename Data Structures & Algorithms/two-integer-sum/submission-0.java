class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        int ans[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            Integer index = indexMap.get(target - nums[i]);
            if (index != null) {
                ans = new int[] {index, i};
                break;
            }
            indexMap.put(nums[i], i);
        }
        return ans;
    }
}
