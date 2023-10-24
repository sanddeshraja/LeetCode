class Solution {
    public int findMin(int[] nums) {
        int ans=5000;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(nums[i]<=nums[mid]){
                ans =min(ans,nums[i]);
                i=mid+1;
            }
            else{
                ans = min(ans,nums[mid]);
                j=mid-1;
            }
        }
        return ans;
    }
    public int min(int a, int b){
        return a>b?b:a;
    }
}