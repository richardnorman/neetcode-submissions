class Solution {
    public boolean isAnagram(String s, String t) {
        // early return safeguard as if not the same length than it is clearly not an anagram
        if (s.length() != t.length()) return false;
        
        // convert the input strings to char arrays
        char[] sSorted = s.toCharArray();
        char[] tSorted = t.toCharArray();

        // sort them, if ordering does not line up perfectly then anagram DNE
        Arrays.sort(sSorted);
        Arrays.sort(tSorted);

        return Arrays.equals(sSorted, tSorted);
    }
}
