class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer sb = new StringBuffer();
        String s;
        String b;
        for(int i=0;i<word1.length;i++){
            sb.append(word1[i]);
        }

        StringBuffer vb = new StringBuffer();
         for(int j=0;j<word2.length;j++){
           vb.append(word2[j]);
        }
      
       if((sb.toString()).equals(vb.toString())) return true;
    
    return false;
        
    }
}