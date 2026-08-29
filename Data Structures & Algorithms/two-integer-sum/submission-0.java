class Solution {
    public int[] twoSum(int[] nums, int target) {
        // return int[] with 2 indices i and j in nums so that nums[i] + nums[j] == target and i != j
        // assuming that every input has exactly  one i and j that satify condition equality
        // return smallest index first


        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int [] {i, j};
                }
            }
        }
        return new int[0];
    }
}