class Solution {
    public int findDuplicate(int[] nums) {
       
    int l = 1, h = nums.length - 1;
    while (l <= h) {
        int mid = (int) (l + (h - l) * 0.5);
        int cnt = 0;
        for (int a : nums) {
            if (a <= mid) ++cnt;
        }
        if (cnt <= mid) l = mid + 1;
        else h = mid - 1;
    }
    return l;
} 
}
