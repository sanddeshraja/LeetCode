class Solution {
    public boolean judgeCircle(String moves) {
        int UD,LR;
        UD=0;
        LR=0;
       
         for(int i=0;i<moves.length();i++)
         {
             if(moves.charAt(i)=='U')
             {
                 UD++;
             }
             else if(moves.charAt(i)=='D')
             {
                 UD--;
             }
             else if(moves.charAt(i)=='L')
             {
                 LR++;
             }
             else
             {
                 LR--;
             }
         }
         if(UD==0 && LR==0)
            return true;
        else
         return false;
}
}