class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minsum=Integer.MAX_VALUE;
        for(int k=l;k<=r;k++){
            int windowsum=0;
            for(int i=0;i<k;i++){
                windowsum+=nums.get(i);
            }
            if(windowsum>0){
                minsum=Math.min(minsum,windowsum);
            }
            for(int i=k;i<nums.size();i++){
                windowsum+=nums.get(i)-nums.get(i-k);
                if(windowsum>0){
                    minsum=Math.min(minsum,windowsum);
                }
            }
        }
        if(minsum==Integer.MAX_VALUE){
            return -1;
        }
        return minsum;
    }
}