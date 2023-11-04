class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int maxi=0;
        for(int i=0;i<left.length;i++){
            maxi=Math.max(maxi,left[i]);
        }
        for(int j=0;j<right.length;j++){
            maxi=Math.max(maxi,n-right[j]);
        }
        return maxi;
    }
}