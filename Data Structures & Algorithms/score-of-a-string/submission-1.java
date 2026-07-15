class Solution {
    public int scoreOfString(String s) {
        int sum = 0;

        if (s.isEmpty() || s == null) return sum;

        s = s.toLowerCase();

        for (int i = 0; i < s.length() - 1; i++) {
            int curr = Math.abs(s.charAt(i) - s.charAt(i+1));
            sum = sum + curr;
        }

        return sum;
    }
}