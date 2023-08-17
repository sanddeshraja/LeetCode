class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        int curr = left;
        while(left <= right){
            int lastDigit = Integer.MIN_VALUE;
            boolean redFlag = false;
            while(curr > 0){
                lastDigit = curr % 10;
                if(lastDigit == 0){
                    break;
                }
                if(!(left % lastDigit == 0)){
                    redFlag = true;
                    break;
                }else{
                    curr/=10;
                }
            }
            int ans = left;
            curr = left + 1;
            left = curr;
            if(redFlag == true || lastDigit == 0) continue;
            list.add(ans);
        }
        return list;
    }
}