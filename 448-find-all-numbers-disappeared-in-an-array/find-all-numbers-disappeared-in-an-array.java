class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       
        HashSet<Integer>arr=new HashSet<>();
       for(int num:nums){
          arr.add(num);
       }
        
        ArrayList<Integer>ans=new ArrayList<>();
       for(int i=1;i<=nums.length;i++){
        if(!arr.contains(i)){
            ans.add(i);
        }
       }
       return ans;
    }
}