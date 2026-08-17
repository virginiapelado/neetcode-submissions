class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int pointer = i + 1;
            while (pointer < nums.length){
                if (nums[i] + nums[pointer] == target) {
                    return new int[]{i, pointer};
                }
                pointer++;
            }
        }
        return new int[]{};
    }
}
