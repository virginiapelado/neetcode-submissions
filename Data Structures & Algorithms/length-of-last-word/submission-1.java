class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
            } else if (i + 1 < s.length() && s.charAt(i + 1) != ' ') {
                // ^ this checks that i+1 is smaller than the string length (not beyond the last character)
                // & checks that the next character is not a space
                count = 0;
            }
        }
        return count;
    }
}