class Solution {
    public boolean isPalindrome(String s) {
        // remove all spaces from string to get the length of the string without spaces or other characters
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // end pointer starting at the very end
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;   // found mismatch
            }
            start++;
            end--;
        } 
        return true; // found no mismatch -> palindrome
    }
}
