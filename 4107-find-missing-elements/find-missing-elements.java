class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        HashSet<Integer>arr=new HashSet<>();
        for(int num:nums){
            arr.add(num);
            max=Math.max(max,num);
            min=Math.min(min,num);
        }
          List<Integer>ans=new ArrayList<>();
           for(int i=min;i<=max;i++){
            if(!arr.contains(i)){
                ans.add(i);
            }
           }
           return ans;
            }
}