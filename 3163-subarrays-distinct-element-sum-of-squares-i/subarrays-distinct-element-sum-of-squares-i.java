class Solution {

    public int myfunc(List<Integer> num){
        HashSet<Integer> set = new HashSet<>(num);
        return set.size();

    }
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<=nums.size();j++){
                sum+=Math.pow((myfunc(nums.subList(i,j))),2);
            }
        }
        
        
        
        return sum;
    }
}