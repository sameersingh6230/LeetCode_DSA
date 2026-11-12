class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int[] k= new int[n];
        k[0]=nums[0];
        k[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            k[i]=Math.max(k[i-1],nums[i]+k[i-2]);
        }
        return k[n-1];
    }
}
