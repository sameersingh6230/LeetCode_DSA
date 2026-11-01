class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> hash = new HashMap<>();
        int max = nums[0];
        int count = 1;
        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(nums[i])){
                hash.put(nums[i],hash.get(nums[i])+1);
                if(hash.get(nums[i])>count){
                    max = nums[i];
                    count = hash.get(nums[i]);
                }
            }else {
                hash.put(nums[i],1);
            }
        }
        return max;
   }
}
