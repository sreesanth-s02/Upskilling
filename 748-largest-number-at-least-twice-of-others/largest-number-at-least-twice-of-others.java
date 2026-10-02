class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex=0;
        int m=Integer.MIN_VALUE;
        int s=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>m && s!=nums[i]){
                s=m;
                m=nums[i];
                maxIndex=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=m && m<2*nums[i]){
                return -1;
            }
        }
        return maxIndex;
    }
}