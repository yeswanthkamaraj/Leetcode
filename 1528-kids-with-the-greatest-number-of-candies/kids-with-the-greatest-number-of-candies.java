class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     int max=0;
     List<Boolean> a=new ArrayList<>();
     for(int i:candies){
         max=Math.max(max,i);
     }
     for(int i: candies){
         a.add(i+extraCandies>=max);
     }
     return a;
    }
}