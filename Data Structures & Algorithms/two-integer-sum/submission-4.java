class Solution {
    public int[] twoSum(int[] nums, int target) {
        // return int[] with 2 indices i and j in nums so that nums[i] + nums[j] == target and i != j
        // assuming that every input has exactly  one i and j that satify condition equality
        // return smallest index first

        // k: diff
        // v: index
        HashMap <Integer, Integer> indexTargetSumMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // get the difference, the needed pre-existing entry in the map, if present would satisfy the problem statement
            int diff = target - nums[i];

            // check if the mapping already has the diff present
            if (indexTargetSumMap.containsKey(diff)) {
                // return the pre-existing diff's index along with the current index of the int as the previous index is ALWAYS smaller than the current int
                return new int[] {indexTargetSumMap.get(diff), i};
            }
            indexTargetSumMap.put(nums[i], i);
        }

        return new int[0];
    }
}