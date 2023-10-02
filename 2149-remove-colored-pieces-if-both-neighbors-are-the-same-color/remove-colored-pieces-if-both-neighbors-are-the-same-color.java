class Solution {
    public boolean winnerOfGame(String colors) {
        int colora=0;
        int colorb=0;
        char arr[]=colors.toCharArray();
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]=='A'&& arr[i-1]=='A' && arr[i+1]=='A'){
                colora++;
            }
             else if(arr[i]=='B'&& arr[i-1]=='B' && arr[i+1]=='B'){
                colorb++;
            }
        }
        return colora>colorb;
    }
}