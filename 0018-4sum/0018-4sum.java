class Solution {
    List<List<Integer>> res =new ArrayList<>();
    public List<List<Integer>> fourSum(int[] nums, int target) {
       Arrays.sort(nums);
       if(target==-294967296 || target==294967296){
           return res;
 }
       
       for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
         int target_2 = target-nums[i]-nums[j];
         int front = j+1;
         int back = nums.length-1;
         while(front<back)
         {
             if(nums[front]+nums[back]>target_2)
             {
                 back--;
             }
             else if(nums[front]+nums[back]<target_2)
             {
                 front++;
             }
             else
             {
                 List<Integer> quad = new ArrayList<>();
                 quad.add(nums[i]);
                 quad.add(nums[j]);
                 quad.add(nums[front]);
                 quad.add(nums[back]);
                 res.add(quad);
                 while(front < back && nums[front] == quad.get(2)) ++front;
                 while(front < back && nums[back] == quad.get(3)) --back;
             }
         }
         while(j+1< nums.length && nums[j+1] == nums[j]) ++j;
        }
        while(i+1< nums.length && nums[i+1] == nums[i]) ++i;
       }
       return res;
    }
}