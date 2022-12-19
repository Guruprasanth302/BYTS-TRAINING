class Solution {
    public void sortColors(int[] nums) {
        int l1 = 0;
        int r = nums.length-1; 
        for (int i = l1; i <= r; i++) {
            while (l1 <= i && i <= r && nums[i] != 1) {
                if (nums[i] == 0) {
                    int tmp = nums[i];
                    nums[i] = nums[l];
                    nums[l] = tmp;
                    l1++;
                } else if (nums[i] == 2) {
                    int tmp = nums[i];
                    nums[i] = nums[r];
                    nums[r] = tmp;
                    r--;
                }
            }
        }
    }
}
