class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> list=new ArrayList<>();
        String s="123456789";
        int lowlength=String.valueOf(low).length();
        int highlength=String.valueOf(high).length();
        for(int len=lowlength;len<=highlength;len++){
            for(int start=0;start<=s.length()-len;start++){
                String sub=s.substring(start,start+len);
                int num= Integer.parseInt(sub);
                if(num>=low && num<=high){
                    list.add(num);
                }
            }
        }
        return list;
    }
}