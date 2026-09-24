class Solution {

    public int split(int i){
        int temp = i;
        int sum=0;
        while(temp!=0){
            int digit=temp%10;
            sum=sum+digit;
            temp/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int digitsum=0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                digitsum=nums[i];
                if(digitsum==i){
                  ans=Math.min(ans,digitsum);  
                }
            }
            else{
                int res=split(nums[i]);
                if(res==i){
                    ans=Math.min(ans,res);
                }
            }
        }
        if(ans!=Integer.MAX_VALUE){
            return ans;
        }
        else{
            return -1;
        }
    }
}