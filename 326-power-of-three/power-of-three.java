class Solution {


    public boolean rec(int num){
        if(num==1){
            return true;
        }
        else if(num%3==0){
            return rec(num/3);
        }
        
        return false;
    }
    public boolean isPowerOfThree(int n) {
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%2==0){
            return false;
        }
        else if(rec(n)){
            return true;
        }
        return false;
    }
}