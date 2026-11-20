class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{
            findBound(nums, target, true), 
            findBound(nums, target, false) 
        };
    }

    public int findBound(int[] nums, int target, boolean isFirst) {
        int low = 0, high = nums.length - 1;
        int index = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] == target) {
                index = mid;
                if (isFirst) {
                    high = mid - 1; 
                } else {
                    low = mid + 1;  
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }
}
