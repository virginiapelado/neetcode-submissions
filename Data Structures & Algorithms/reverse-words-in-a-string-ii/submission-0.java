class Solution {
    public void reverseWords(char[] s) {

        // 1. reversse whole array once
        swap(s, 0, s.length - 1);

        // 2. reverse each word back
        int start = 0;
        for (int end = start; end < s.length; end++) {
            if (end + 1 == s.length || s[end + 1] == ' ') {
                swap(s, start, end);
                start = end + 2;
            }
        }
        
    }

    // reverse an array from a start to an end point in place
    private void swap(char[] s, int left, int right) {
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
