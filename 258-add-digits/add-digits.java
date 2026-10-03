class Solution {

    public int add(int n){
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum=sum+digit;
            n/=10;
        }
        if(sum>9){
            return add(sum);
        }
        return sum;
    }
    public int addDigits(int num) {
        if(num==0){
            return 0;
        }
        int res=add(num);
        return res;
    }
}