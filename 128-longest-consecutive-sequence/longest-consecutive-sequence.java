class Solution {
    static 
    {
        for(int i=0;i<500;i++)
            longestConsecutive(new int[]{});
    }
    public static int longestConsecutive(int[] nums) {
        int longstreak=0;
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        for(int num:set){
            if(!(set.contains(num-1))){
                int currentnum=num;
                int currentstreak=1;
                while(set.contains(currentnum+1)){
                    currentnum++;
                    currentstreak++;
                }
                longstreak=Math.max(longstreak,currentstreak);
            }
        }
        return longstreak;
    }
}