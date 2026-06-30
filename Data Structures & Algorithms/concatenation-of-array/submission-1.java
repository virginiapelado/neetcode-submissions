class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        
        ArrayList<Integer> ans = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            ans.add(nums[i]);
        }
        for (int i = 0; i < n; i++) {
            ans.add(nums[i]);
        }
        
        // Convert ArrayList<Integer> to int[] using Streams
        return ans.stream()
                    .mapToInt(Integer::intValue) // or i -> i
                    .toArray();

    }
}