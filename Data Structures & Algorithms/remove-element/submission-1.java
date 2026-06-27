class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; //number of elements != val

        int end = nums.length - 1;

        // move all val to the end
        for (int start = 0; start <= end; ) {
            if (nums[start] == val) {
                // remove val -> swap val with pointer at the end
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                // move end pointer to the left
                end--; 
            } else {
                k++;
                start++;
            }
        }  
        return k;
    }
}