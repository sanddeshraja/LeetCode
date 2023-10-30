class Solution {
    public boolean isPerfectSquare(int num) {
     long low=0;
     long high=num;
     long mid=0;
     while(low<=high)
     {
          mid=(long)(low+(high-low)/2);
         if((long)mid*mid==num)
          return true;
         if((long)mid*mid<num)
           low=mid+1;
         if((long)mid*mid>num)
           high=mid-1;
     }   
     return false;
    }
}