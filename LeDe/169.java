class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> counts = new HashMap<>();
        int max = nums.length / 2;
        for (int num : nums){
            int currentCount = counts.getOrDefault(num, 0) + 1;
            counts.put(num, currentCount);
            if (currentCount > max) {
                return num;
            }            
        }
        return -1;
    }
}