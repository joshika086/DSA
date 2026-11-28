class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer>s=new HashMap<>();
        for(int i=0;i<nums.length;i++){
           int required=target-nums[i];
             if(s.containsKey(required)){
                return new int[]{s.get(required),i};
             }
             s.put(nums[i],i);
            
        }
        return new int[]{-1,-1};
    }
}