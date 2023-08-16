class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int[] newArr = new int[nums.length];
        int j = nums.length-1;
        for(int count =nums.length-1;count>=0;count--){
            if(Math.pow(nums[i],2)>=Math.pow(nums[j],2)){
                newArr[count]=(int)Math.pow(nums[i],2);
                i++;
            }
            else{
                newArr[count]=(int)Math.pow(nums[j],2);
                j--;
            }
             

            
        }
        return newArr;
    }
}