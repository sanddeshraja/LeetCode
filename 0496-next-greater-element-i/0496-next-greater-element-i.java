class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        int j=0;
       for(int i=0;i<nums1.length;i++) 
       {
           int currmax=nums1[i];
           int temp=-1;
           while(j<nums2.length-1)
           {
               if(nums1[i]!=nums2[j])
                j++;
                else
                 break;
           }
           for(;j<nums2.length && temp==-1;j++)
           {
               if(currmax>=nums2[j])
                continue;
               else if(currmax<nums2[j]){
               temp=nums2[j];
               }
           }
           ans[i]=temp;
           j=0;
       }
       return ans;
    }
}