class Solution {
    public int percentageLetter(String s, char l) {
        Map<Character,Integer>fmap=new HashMap<>();
        for(int i=0;i<s.length();i++){
                char a=s.charAt(i);
                if(fmap.containsKey(a)){
                    int f=fmap.get(a);
                    fmap.put(a,f+1);
                }
                else{
                    fmap.put(a,1);
                }
        }
        int v=0;
        
        if(fmap.containsKey(l)){
            v=fmap.get(l);
        }
        
        int ans=v*100/s.length();
        return ans;
    }
}