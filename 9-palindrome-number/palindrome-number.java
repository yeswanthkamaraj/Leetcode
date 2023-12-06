class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
       int rev=0;
       int ans=x;
       while(x!=0){
           int temp=x%10;
           rev=rev*10+temp;
           x=x/10;
       } 
       if(rev==ans){
           return true;
       }
       return false;
    }
}