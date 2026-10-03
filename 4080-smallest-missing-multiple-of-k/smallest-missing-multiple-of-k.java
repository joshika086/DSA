class Solution {
    public int missingMultiple(int[] nums, int k) {
    Set<Integer>l=new HashSet<>();
for(int i=0;i<nums.length;i++){
        l.add(nums[i]);}
    int i=k;
   while(l.contains(i)){
    i=i+k;
   }
      
      return i;
    }
}