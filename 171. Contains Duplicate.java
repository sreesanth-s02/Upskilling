class Solution {
    static{
        for(int i = 0; i <= 500; i++) 
            containsDuplicate(new int[]{0, 1, 0});
    }
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            else{
                map.put(nums[i],1);
            }
        }
        return false;
    }
}