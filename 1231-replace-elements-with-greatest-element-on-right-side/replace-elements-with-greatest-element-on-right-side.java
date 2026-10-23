class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int max_val=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>max_val){
                    max_val=arr[j];
                }
            }
            arr[i]=max_val;
        }
        return arr;
    }
}