class Solution {
    public String longestPalindrome(String s) {
      int n = s.length();
        if(n <= 1) return s;
        int maxLen = 1;
        int start = 0;
        //for odd length 
        for(int i=0;i<n;i++){
            int l = i;
            int r = i;
            while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)){
                l--;
                r++;
            }
            int len = r-l-1;
            if(len > maxLen){
                maxLen = len;
                start = l+1;
            }
        }
        //for Even length 
        for(int i=0;i<n;i++){
            int l = i;
            int r = i+1;
            while(l >= 0 && r<n && s.charAt(l) == s.charAt(r)){
                l--;
                r++;
            }
            int len = r-l-1;
            if(len > maxLen){
                maxLen = len;
                start = l+1;
            }
        }
        return s.substring(start,start+maxLen);
      
    }
}