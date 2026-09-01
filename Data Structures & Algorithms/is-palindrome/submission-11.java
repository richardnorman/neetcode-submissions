class Solution {
    public boolean isPalindrome(String s) {
        char[] letters = s.toCharArray();
        // ArrayList<Character> lettersList = new ArrayList();
        // for(char letter : letters) {
        //     if (Character.isLetterOrDigit(letter)) lettersList.add(Character.toLowerCase(letter));
        // }

        for (int start = 0, end = letters.length - 1; start < end; start++, end--) {
            while(!Character.isLetterOrDigit(letters[start]) && start < end) start++;
            while(!Character.isLetterOrDigit(letters[end]) && end > start) end--;

            System.out.println("start: " + letters[start] + " === end: " + letters[end]);
            // if both start and end index chars are alphanumeric, compare them to make sure they are the same
            if (Character.toLowerCase(letters[start]) != Character.toLowerCase(letters[end])) return false;
        }

        return true;
    }
}