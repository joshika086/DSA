class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> l = new HashSet<>();

        for(int n : nums){
            l.add(n);
        }

        for(int i = 0; i < nums.length; i++){
            if(!(l.contains(i + 1))){
                return i + 1;
            }
        }

        return nums.length + 1;
    }
}