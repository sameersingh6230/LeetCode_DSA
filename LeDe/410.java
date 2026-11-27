class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0, high = 0;
        for (int n : nums) {
            low = Math.max(low, n);
            high += n;
        }
        while(low < high){
            int mid = low + (high - low) / 2;
            if(canSplit(nums, k, mid)){
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public boolean canSplit(int[] nums, int k, int limit){
        int parts = 1, sum = 0;
        for(int n : nums){
            if(sum + n > limit){
                parts++;
                sum = n;
            } else {
                sum += n;
            }
        }
        return parts <= k;
    }
}
