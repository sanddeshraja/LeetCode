class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int[] mergeArr = new int[nums1.length+nums2.length];
       int i=0;
       int j=0;
       int k=0;
       while(i<nums1.length && j<nums2.length){
        if(nums1[i]>=nums2[j])
            mergeArr[k++]=nums2[j++];
        else
            mergeArr[k++]=nums1[i++];
       }
       while (i < nums1.length) {
            mergeArr[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            mergeArr[k] = nums2[j];
            j++;
            k++;
        }
        int start=0;
        int end = mergeArr.length-1;
        int mid = (int)(start+end/2);
        if(mergeArr.length%2==0)
        return (double)(mergeArr[mid]+mergeArr[mid+1])/2;
        else
         return (double)(mergeArr[mid]);
        
    }
}