class Solution {
    public boolean judgeCircle(String moves) {
       
           char[] ch = moves.toCharArray();
        int[] alpha = new int[26];

        for (char c: ch) alpha[(int)(c - 65)]++;

        if (alpha[3] == alpha[20] && alpha[17] == alpha[11]) return true;
        else return false;   
    }
}