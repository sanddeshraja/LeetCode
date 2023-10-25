class Solution {
    public int findMin(int[] nums) {
        int ans = 5000;
        int low =0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                ans =min(ans,nums[mid]);
                low++;
                high--;
                continue;
            }
            if(nums[low]<=nums[mid])
            {
                ans = min(ans,nums[low]);
                low=mid+1;
            }
            else
            {
                ans = min(ans,nums[mid]);
                high=mid-1;
            }
        }
        return ans;
    }
    public int min(int a, int b){
        return a>b?b:a;
    }
}