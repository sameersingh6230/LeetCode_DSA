class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for(int w : weights){
            left = Math.max(left, w);
            right += w;
        }
        while(left < right){
            int mid = left + (right - left) / 2;
            int need = 1;
            int cur = 0;
            for(int w : weights){
                if(cur + w > mid){
                    need++;
                    cur = 0;
                }
                cur += w;
            }
            if(need <= days){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
