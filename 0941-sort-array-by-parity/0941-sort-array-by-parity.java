class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int temp=0;
        while(i<j)
        {
            if(nums[i]%2!=0)
            {
               if (nums[j]%2==0)
                {
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    i++;
                    j--;
                }
                else
                {
                    j--;
                }
            }
            else
            {
                if(nums[j]%2!=0)
                {
                    i++;
                }
                else
                {
                    while(nums[i]%2==0 && i<j)
                    {
                        i++;
                    }
                }
            }

        }
        return nums;
    }
}