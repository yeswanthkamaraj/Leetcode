class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char s) {
         List<String>list=new ArrayList<>();
        for(String i:words){
        String arr[]=i.split("["+s+"]");
       
        for(String ss:arr){
            if(ss.length()>=1)
                list.add(ss);
           }
        }
        return list;
    }
}