class Solution {
    public String reverseWords(String s) {
      String[] words = s.split(" ");
      String ans="";
      for(int i=0;i<=words.length-1;i++)
      {
          if(i!=0)
          {
              ans+=" ";
          }
          for(int j=words[i].length()-1;j>=0;j--)
          {
              ans+=words[i].charAt(j);
          }
      }
      return ans;
    }
}