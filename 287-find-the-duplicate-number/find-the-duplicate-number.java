class Solution {
    public int findDuplicate(int[] nums) {
    Set<Integer>arr= new HashSet<>();
       int duplicate=-1;
       for(int num:nums){
        if(arr.contains(num)){
            // arr.add(num);
            duplicate=num;
            break;
        }
        arr.add(num);
       }
       return duplicate;
    }
}