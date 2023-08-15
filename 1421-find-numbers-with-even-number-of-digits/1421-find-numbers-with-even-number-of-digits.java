class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(Math.floor(nums[i]/10)==0)
                continue;
            else if(Math.floor(nums[i]/100)==0)
                count++;
            else if(Math.floor(nums[i]/1000)==0)
                continue;
            else if(Math.floor(nums[i]/10000)==0)
                count++;
            else if(Math.floor(nums[i]/100000)==0)
                continue;
            else if(Math.floor(nums[i]/1000000)==0)
                count++;
        }
        return count;
    }
}