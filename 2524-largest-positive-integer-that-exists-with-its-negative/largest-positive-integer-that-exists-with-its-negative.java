class Solution {
    public int findMaxK(int[] nums) {
      Set<Integer>arr=new HashSet<>();
     int max=-1;
      for(int num:nums){
        if(arr.contains(-num)){
            max=Math.max(max,Math.abs(num));
            // return max;
        }
        arr.add(num);
      } 
      return max;
    }
}