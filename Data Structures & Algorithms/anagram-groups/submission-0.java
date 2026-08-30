class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // group all Strings that are anagrams into lists and return 2d List

        // k: strs[anagramWordSorted] v: strs[anagramWordOriginalsSorted]
        HashMap<String, ArrayList<String>> anagramStringsSortedToOriginals = new HashMap<String, ArrayList<String>>();

        

        for (String word : strs) {
            char[] compareWordLetters = word.toCharArray();
            // sort ONLY for comparison
            Arrays.sort(compareWordLetters);

            // check if the SORTED words align with any currently existing words in the map when sorted
            if (anagramStringsSortedToOriginals.containsKey(String.valueOf(compareWordLetters))) {
                // the anagram already exists, simply add word to sorted anagram
                anagramStringsSortedToOriginals.get(String.valueOf(compareWordLetters)).add(word);
            } else {
                // the anagram does not exist, add it and add the current word
                anagramStringsSortedToOriginals.put(String.valueOf(compareWordLetters), new ArrayList<String>(List.of(word)));
            }
        }

        ArrayList<List<String>> anagrams = new ArrayList<>();

        // iterate through the hashmap entries and for each anagram key found, add all values found for that sorted anagram
        // to the returned anagram grouped list
        for (Map.Entry<String, ArrayList<String>> anagram : anagramStringsSortedToOriginals.entrySet()) {
            anagrams.add(anagram.getValue());
        }

        return anagrams;
    }
}
