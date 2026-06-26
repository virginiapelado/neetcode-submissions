class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num: nums) {
            // if number is not in the map, we add it with the value 1
            if (!countMap.containsKey(num)){
                countMap.put(num, 1);
            } else {
                // if number is already in map -> it's a duplicate -> return true
                return true;
            }
        }
        return false;
    }
}