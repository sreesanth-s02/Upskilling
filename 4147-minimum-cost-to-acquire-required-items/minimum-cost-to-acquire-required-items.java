class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long ans=0;
        long rem=0;
        long best=0;
        if(need1==0 && need2==0){
            return ans;
        }
        else{
            long cost=Math.min(costBoth,cost1+cost2);
            long total=Math.min(need1,need2)*cost;
            if(need1>need2){
                rem=Math.abs(need1-need2);
                best=Math.min(cost1,costBoth);

            }
            else if(need1<need2){
                rem=Math.abs(need1-need2);
                best=Math.min(cost2,costBoth);
            }
            ans=total+(rem*best);
            return ans;

        }
    }
}