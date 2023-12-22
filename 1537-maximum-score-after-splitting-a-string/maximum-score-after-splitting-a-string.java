class Solution {
    public int maxScore(String s) {
           int ans=0;
       int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length()-1;i++){
             int zc=0;
             //int pc=0;
          
             for(int k=0;k<=i;k++){
                 if(s.charAt(k)=='0'){
                     zc++;
                 }
             }
            for(int j=i+1;j<s.length();j++){
                   if(s.charAt(j)=='1'){
                       zc++;
                   }
            }
           
           max=Math.max(zc,max);
        }
        return max;
    }
}