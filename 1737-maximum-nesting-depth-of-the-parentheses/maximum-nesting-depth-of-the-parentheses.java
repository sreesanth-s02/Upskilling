class Solution {
    public int maxDepth(String s) {
        int currentcount=0;
        int maxcount=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                currentcount++;
            }
            else if(s.charAt(i)==')'){
                maxcount=Math.max(maxcount,currentcount);
                currentcount--;
            }
        }
        if(maxcount!=Integer.MIN_VALUE){
            return maxcount;
        }
        return 0;
    }
}