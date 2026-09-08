class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>arr=new HashSet<>();
        int max=0;
        for(int num:nums){
            arr.add(num);
        }
        for(int num:arr){
            if(!arr.contains(num-1)){
                int current =num;
               int count=1;
               while(arr.contains(current+1)){
               current++;
               count++;}
                max=Math.max(max,count);
            }
        }
        return max;
    }
}