class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> duplicateNumberCounter = new HashMap<Integer, Integer>();

        // go through each of the numbers in the nums array input and increment the count of the number frequency by 1
        for (int number : nums) {
            duplicateNumberCounter.put(number, duplicateNumberCounter.getOrDefault(number, 0) + 1);
        }

        // AtomicBoolean cloneFound = new AtomicBoolean(false);

        // duplicateNumberCounter.forEach((k, v) -> {
        //     if (v != 1) cloneFound.set(true);
        // });

        // return cloneFound.get();

        // boolean cloneFound = false;
        // for (Map.Entry<Integer, Integer> freqCount : duplicateNumberCounter.entrySet()) {
        //     if (freqCount.getValue() != 1) return true;
        // }
        // return cloneFound

        boolean cloneFound = duplicateNumberCounter.values().stream().anyMatch(v -> v != 1);
        return cloneFound;
    }
}