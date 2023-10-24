class Solution {
    public boolean search(int[] nums, int target) {
        int i =0;
        int j =nums.length-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[i]==nums[mid] && nums[mid]==nums[j]){
                i++;
                j--;
                continue;
            }
            if(nums[i]<=nums[mid])
            {
                if(nums[i]<=target && target<=nums[mid])
                {
                    j=mid-1;
                }
                else
                {
                    i=mid+1;
                }
            }
            else if(nums[i]>=nums[mid])
            {
                if(nums[mid]<=target && target<=nums[j])
                {
                    i=mid+1;
                }
                else
                {
                    j=mid-1;
                }
        }
    }
    return false;
}
}