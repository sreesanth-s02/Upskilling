class Solution {

    public static boolean rec(int n){
        if(n==2){
            return true;
        }
        else if(n%2==0){
            return rec(n/2);
        }
        return false;
    }
    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }
        else if(rec(n)){
            return true;
        }
        return false;
    }
}