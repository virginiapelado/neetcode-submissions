class Solution {
    public boolean isAnagram(String s, String t) {
        // Clarifications: - do CAPS matter?, - ANSCII code?
        // Idea: to check if it's an anagram I only need to make sure there are the same number of the exact same characters
        // First check is string lengths are equal
        // Create a hasmap with all characters from s, for t substract from the hasmap
        // If they are identical --> all values in hashmap will be 0

        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)){
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

       for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
            } else {
                return false;
            }
       }

       for (int value : map.values()) {
            if (value != 0) {
                return false;
            }
       }

       return true;
    }
}