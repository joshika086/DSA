class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
       Set<Integer>l=new HashSet<>();
       for(int s:nums){
        l.add(s);
}int count=0;
       for(int i=0;i<nums.length;i++){
        if(l.contains(nums[i]+diff)){
           if(l.contains(nums[i]+2*diff)){
            count++;
           }
        }
       }
       return count;
           }
}