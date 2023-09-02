class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer>s=new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        int i=0;
        for(int r:s){
            nums[i++]=r;
        }
        return s.size();
    }
}