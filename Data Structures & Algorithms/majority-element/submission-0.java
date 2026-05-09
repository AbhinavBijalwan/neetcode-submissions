class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int count = 0;
        for (int num : nums) {
            if (num == majorityElement) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    majorityElement = num;
                    count = 1;
                }
            }
        }
        return majorityElement;
    }
}