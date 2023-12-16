class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length()!=t.length()){
          return false;
      }  
         char[] arraya=s.toLowerCase().toCharArray();
       char[] arrayb=t.toLowerCase().toCharArray();
        Arrays.sort(arraya);
        Arrays.sort(arrayb);
        return Arrays.equals(arraya,arrayb);
    }
}