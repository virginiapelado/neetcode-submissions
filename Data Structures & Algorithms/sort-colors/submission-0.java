class Solution {
    public void sortColors(int[] nums) {
        int curr = 0;
        int start = 0;
        int end = nums.length - 1;
        
        while (curr <= end) {
            if (nums[curr] == 0) {
                // swap with start
                int temp = nums[curr];
                nums[curr] = nums[start];
                nums[start] = temp;
                start++;
                curr++;
            } else if (nums[curr] == 2) {
                // swap with end
                int temp = nums[curr];
                nums[curr] = nums[end];
                nums[end] = temp;
                end--;
            } else {
                curr++;
            }

        }
    }
}