class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = indexMap.get(target - nums[i]);
            if (index != null) {
                return new int[] {index, i};
            }
            indexMap.put(nums[i], i);
        }
        return new int[] {};
    }
}
