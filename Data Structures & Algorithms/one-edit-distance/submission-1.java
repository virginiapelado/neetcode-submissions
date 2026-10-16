class Solution {
    public boolean isOneEditDistance(String s, String t) {
        // if length difference is greater than 1, cannot be one edit distance
        if (Math.abs(s.length() - t.length()) > 1 || s.equals(t)) {
            return false;
        }

        int sp = 0;
        int tp = 0;
        int diff = 0;

        while (sp < s.length() && tp < t.length()) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
                tp++;
            } else if (s.length() < t.length()) {
                tp++;
                diff++;
            } else if (t.length() < s.length()) {
                sp++;
                diff++;
            } else {
                sp++;
                tp++;
                diff++;
            }
            if (diff > 1) {
                return false;
            }
        }

        if (sp < s.length() || tp < t.length()) {
            diff++;
        }

        return diff == 1;
    }
}