class Solution {
    public long sumAndMultiply(int n) {
        int temp=n;
        long x=0;
        long i=1;
        long sum=0;
        while(temp!=0){
            int digit =temp%10;
            if(digit!=0){
                x=x+(digit*i);
                i*=10;
                sum=sum+digit;
            }
            temp/=10;
        }
        return (long)x*sum;
    }
}