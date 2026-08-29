class Solution {
    public int[] twoSum(int[] nums, int target) {
        // return int[] with 2 indices i and j in nums so that nums[i] + nums[j] == target and i != j
        // assuming that every input has exactly  one i and j that satify condition equality
        // return smallest index first

        HashMap <Integer, Integer> indexTargetSumMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            indexTargetSumMap.putIfAbsent(nums[i], i);

            // check map to see if value + another existing value is now present in the HashMap
            if (indexTargetSumMap.containsKey(target - nums[i]) && i != indexTargetSumMap.get(target - nums[i])) {
                int[] ijIndex = new int[] {indexTargetSumMap.get(target - nums[i]), i};
                Arrays.sort(ijIndex);
                return ijIndex;
            }
        }

        return new int[0];
    }
}