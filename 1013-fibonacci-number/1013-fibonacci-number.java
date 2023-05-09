class Solution {
    public int fib(int n) {
            return fiboCalc(n);
        }
    
    public int fiboCalc(int n)
    {
        if(n == 0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        while(n>=2){
        return fiboCalc(n-1) + fiboCalc(n-2);
        }
        return 0;
    }
}