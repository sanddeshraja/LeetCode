class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        Arrays.sort(nums);
        int high = nums[nums.length-1];
        int ans = -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(isThreshold(nums, mid)<=threshold)
            {
                ans = mid;
                high = mid-1;
            }
            else
             low = mid+1;
        }
        return ans;
    }
    public int isThreshold(int[] nums, int mid){
        int sum =0;
        for(int i =0;i<nums.length; i++)
        sum+= Math.ceil((double)nums[i]/mid);
        return sum;
    }
}