class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int s1=nums[n-1]-nums[2];
        int s2=nums[n-2]-nums[1];
        int s3=nums[n-3]-nums[0];
        return Math.min(s1,Math.min(s2,s3));

    }
}