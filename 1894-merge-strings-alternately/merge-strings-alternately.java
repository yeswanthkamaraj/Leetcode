class Solution {
    public String mergeAlternately(String w1, String w2) {
         int n=w1.length();
         int m=w2.length();
         int i=0,j=0;
         StringBuilder sb=new StringBuilder();
         while(i<n||j<m){
            if(i<n){
               sb.append(w1.charAt(i++));
            }
            if(j<m){
                sb.append(w2.charAt(j++));
            }
         }
         return sb.toString();
    }
}