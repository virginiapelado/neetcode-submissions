class Solution {
    public int strStr(String haystack, String needle) {
        int needleP = 0;
        int needleStart = -1;

        // if needle is longer than haystack -> can't be found
        if (needle.length() > haystack.length()) return -1;
        // if the have same length they need to be equal, otherwise false
        if (needle.length() == haystack.length()) {
            if (needle.equals(haystack)) return 0;
            else return -1;
        }

        // iterate through haystack
        for (int hayP = 0; hayP < haystack.length(); hayP++) {
            if (haystack.charAt(hayP) == needle.charAt(needleP)) {
                needleP++;
                if (needleP == needle.length()) {
                    return hayP + 1 - needle.length();
                }
            // this else{} I don't understand
            } else {
                hayP -= needleP;  // move hayP back to the start of the current attempt
                needleP = 0;      // reset the needle pointer
            }
        }
        return needleStart;
    }
}