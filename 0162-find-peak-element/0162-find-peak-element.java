class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length-1 ==0 )
            return 0;
        if(nums[0]>nums[1])
            return 0;
        
        int high=nums.length-1;
        if(nums[high]>nums[high-1])
        {
            return high;
        }
        high=high-1;
        int low=1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
               return mid;
            }
            if(nums[mid]>nums[mid-1])
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }
}