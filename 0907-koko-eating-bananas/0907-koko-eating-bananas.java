class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        Arrays.sort(piles);
        int high =piles[piles.length-1];
        while(low<=high){
            int mid = low + (high - low)/2;
            int totalHours = findHours(piles, mid);
            if(totalHours<= h){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    public int findHours(int[] piles, int high){
        int totalHours = 0;
        for(int i =0; i<piles.length;i++)
        totalHours+=Math.ceil(piles[i]/(double)high);
        return totalHours;

    }
}