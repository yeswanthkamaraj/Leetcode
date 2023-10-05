class Solution {
    public ArrayList < Integer > majorityElement(int[] nums) {
     ArrayList <Integer>list=new ArrayList < Integer >();
     HashMap<Integer,Integer>fmap=new HashMap<Integer,Integer>();
     for(int i=0;i<nums.length;i++){
       int a=nums[i];
       if(fmap.containsKey(a)){
         int f=fmap.get(a);
         fmap.put(a,f+1);
       }
       else{
         fmap.put(a,1);
       }

     }
      for(int i:fmap.keySet()){
        if(fmap.get(i)>nums.length/3){
          list.add(i);
        }
      }
      return list;
    }
}