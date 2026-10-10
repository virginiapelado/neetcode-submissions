class Solution {
    public boolean canPermutePalindrome(String s) {
         int count = 0;
        HashSet<Character> set = new HashSet<>();

            for (char c : s.toCharArray()) {
                if (!set.contains(c)) {
                    set.add(c);
                    count++;
                } else {
                    set.remove(c);
                    count--;
                }
            }
            if (s.length() % 2 == 0 && count == 0 || s.length() % 2 == 1 && count == 1) {
                return true;
            } else {
                return false;
            }
    }
}
