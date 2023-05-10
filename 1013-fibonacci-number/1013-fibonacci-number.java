class Solution {
    Map<Integer,Integer> map = new HashMap<>();
   
    public int fib(int n) {
         map.put(0,0);
        map.put(1,1);
            if(map.containsKey(n))
                return map.get(n);
            else{
                map.put(n,fib(n-1) + fib(n-2));
                return map.get(n);
            }
        }
    }