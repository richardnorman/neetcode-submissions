class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> duplicateNumberCounter = new HashMap<Integer, Integer>();

        // go through each of the numbers in the nums array input and increment the count of the number frequency by 1
        for (int number : nums) {
            // early exit safeguard to simply just prevent further execution if any key/number already exists in the hashMap
            if (duplicateNumberCounter.get(number) != null) return true;
            duplicateNumberCounter.put(number, duplicateNumberCounter.getOrDefault(number, 0) + 1);
        }

        return false;

        // One way to do this is to use AtomicBoolean and a for each on the hashmap itself in order to iterate
        // through the map and see if any frequency count is greater than 1 (DNE 1)
        //
        // AtomicBoolean cloneFound = new AtomicBoolean(false);

        // duplicateNumberCounter.forEach((k, v) -> {
        //     if (v != 1) cloneFound.set(true);
        // });

        // return cloneFound.get();

        // Another way to do this is to use a standalone for each loop and iterate throught the map
        //
        // boolean cloneFound = false;
        // for (Map.Entry<Integer, Integer> freqCount : duplicateNumberCounter.entrySet()) {
        //     if (freqCount.getValue() != 1) return true;
        // }
        // return cloneFound

        // Another way to do this is to convert the map values to a stream and assign anyMatch return
        // directly to the returned boolean

        // return duplicateNumberCounter.values().stream().anyMatch(v -> v != 1);
    }
}