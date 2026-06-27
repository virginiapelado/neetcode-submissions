class Solution {
    public boolean isSubsequence(String s, String t) {
        int sPtr = 0;
        
        // figure out what string is larger
        // the shorter string is going to be the possible subsequence
        if (s.length() <= t.length()) {
            if (s.length() == 0) return true;
            // go through t
            for (int tPtr = 0; tPtr < t.length(); tPtr++) {
                if (t.charAt(tPtr) == s.charAt(sPtr)) {
                    sPtr++;
                }
                if (sPtr == s.length()) return true;
                // Note: Added if (sPtr == s.length()) return true; inside the for loop to prevent sPtr from exceeding the bounds of string s.
            }
            return sPtr == s.length();
        } else {
            // If s is longer than t, it cannot be a subsequence
            return false;
        }

    }
}