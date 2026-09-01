class Solution {
    public boolean isPalindrome(String s) {
        char[] letters = s.toCharArray();
        ArrayList<Character> lettersList = new ArrayList();
        for(char letter : letters) {
            if (Character.isLetterOrDigit(letter)) lettersList.add(Character.toLowerCase(letter));
        }

        System.out.println(lettersList);

        for (int start = 0, end = lettersList.size() - 1; start < end; start++, end--) {
            // if both start and end index chars are alphanumeric, compare them to make sure they are the same
            if (lettersList.get(start) != lettersList.get(end)) return false;
        }

        return true;
    }
}