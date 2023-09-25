class Solution {
    public int maximumWealth(int[][] accounts) {
        int result=0;
        int max=0;
        for(int i=0;i<accounts.length;i++){
             for(int j=0;j<accounts[i].length;j++){
                 result=result+accounts[i][j];
             }
             max=Math.max(result,max);
             result=0;
        }
        return max;
    }
}