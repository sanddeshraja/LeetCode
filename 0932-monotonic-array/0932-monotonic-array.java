class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums[0]>nums[nums.length-1])
        {
             for(int i=0;i<=nums.length-2;i++){
              if(nums[i]>=nums[i+1])
                continue;
              else
                return false;
             }
        }
        else if(nums[0]<nums[nums.length-1])
        {
             for(int i=0;i<=nums.length-2;i++){
              if(nums[i]<=nums[i+1])
                continue;
              else
                return false;
             }
        }
        else
        {
             for(int i=0;i<=nums.length-2;i++){
              if(nums[i]==nums[i+1])
                continue;
              else
                return false;
        }
        }
        return true;
    }
}