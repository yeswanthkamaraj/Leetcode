class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<nums.length;i++){
          max=Math.max(max,nums[i]);
          min=Math.min(min,nums[i]);
        }
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max && nums[i]!=min){
                ans=nums[i];
                break;
            }
        }
        return ans;
    }
}