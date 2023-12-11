class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer,Integer>fmap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int a=arr[i];
            if(fmap.containsKey(a)){
                int f=fmap.get(a);
                fmap.put(a,f+1);
            }
            else{
                fmap.put(a,1);
            }
        }
        int ans=arr.length/4;
        for(int i:fmap.keySet()){
            if(fmap.get(i)>ans){
                return i;
            }
        }
        return -1;
    }
}