class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String num=String.valueOf(i);
            if(num.length()%2==0){
                int half=num.length()/2;
                int leftSum=0;
                int rightSum=0;
                for(int j=0;j<half;j++){
                    leftSum=leftSum+(num.charAt(j)-'0');
                    rightSum=rightSum+(num.charAt(j+half))-'0';
                }
                if(leftSum==rightSum){
                    count++;
                }
            }
        }
        return count;
    }
}