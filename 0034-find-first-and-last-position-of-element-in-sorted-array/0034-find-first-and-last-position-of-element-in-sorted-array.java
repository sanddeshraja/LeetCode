class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int fo=0;
        int lo=0;
        while(i<=j)
        {
            int mid = i+(j-i)/2;
            if(nums[mid]==target)
            {
                fo=find(nums, mid,target,true);
                lo=find(nums, mid,target, false);
                return new int[]{fo,lo};
            }
            else if(nums[mid]< target){
                i=mid+1;
            }
            else
                j=mid-1;
        }
        if(fo==0){
            return new int[]{-1,-1};
        }
        else
            return new int[]{fo,lo};
    }
    int find(int[] a, int mid, int target, boolean occurence){
        int temp=-1;
        while( a[mid]==target){
            if(occurence){
                temp=mid;
                mid=mid-1;
            }
            else if(a[mid]==target)
            {
                temp=mid;
                mid=mid+1;
            }
            if(mid == -1 || mid == a.length)
                return temp;
        }
        return temp;
    }
}