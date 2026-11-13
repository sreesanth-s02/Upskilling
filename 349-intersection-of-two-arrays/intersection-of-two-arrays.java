class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int num1:nums1){
            set1.add(num1);
        }
        for(int num2:nums2){
            set2.add(num2);
        }
        HashSet<Integer> intersect = new HashSet<>();
        for(int i:set1){
            if(set2.contains(i)){
                intersect.add(i);
            }
        }
        int[] ans = new int[intersect.size()];
        int index=0;
        for(int j:intersect){
            ans[index++]=j;
        }
        return ans;
    }
}