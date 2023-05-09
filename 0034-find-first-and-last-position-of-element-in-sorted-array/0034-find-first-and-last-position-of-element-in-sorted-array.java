class Solution {
    public int[] searchRange(int[] nums, int target) {
         int[] ans={-1,-1};
         ans[0]=search(nums, target,true);
         ans[1]=search(nums,target,false);
         return ans;

    }
    int search (int[] nums,int target, boolean first)
    {
        int i=0;
        int j=nums.length-1;
        while(i<=j)
        {
            if(first)
            {
                if(nums[i]==target)
                    {
                        return i;
                    }
                else
                 i++;
            }
            else
            {
                if(nums[j]==target)
                {
                    return j;
                }
                else
                 j--;
            }
        }
        return -1;
}
}