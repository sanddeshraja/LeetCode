class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans= new ArrayList<>();
        while(left<=right)
        {
            int cur=left; //12
            int lastDigit=0;
            boolean isSelfDividing=false;
            while(cur>0)
            {
                isSelfDividing=true;
                lastDigit=cur%10;
                if(lastDigit==0){
                    left++;
                    cur=0;
                    isSelfDividing=false;
                    break;
                    
                }
                if(left%lastDigit==0)
            {
                cur=cur/10;
            }
                else{
                 left++;
                 cur=0;
                 isSelfDividing=false;
                }
            }
            if(cur==0 && isSelfDividing==true)
            {
                    ans.add(left);
                    left++;
            }
        }
        return ans;
    }
}