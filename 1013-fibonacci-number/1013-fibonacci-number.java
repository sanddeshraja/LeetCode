class Solution {
    public int fib(int n) {
          if(n<=1){
            return n;
             }   
        else{
        if(n>=2){
        return fib(n-1) + fib(n-2);
        }
        return 0;
        }
    }
    
 
}