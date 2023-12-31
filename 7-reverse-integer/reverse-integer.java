class Solution {
    public int reverse(int x) {
        long rev=0;
        while(x!=0){
            int temp=x%10;
            rev=rev*10+temp;
            if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE){
                return 0;
            }
            x=x/10;
        }
        return (int) rev;
    }
}