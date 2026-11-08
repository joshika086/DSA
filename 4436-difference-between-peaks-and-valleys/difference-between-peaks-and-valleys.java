class Solution {
    public int peakValleyDifference(int[] nums) {
        int sum=0;
        int count=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                sum=sum+nums[i];
            }
            else if(nums[i]<nums[i-1] && nums[i]<nums[i+1]){
                count=count+nums[i];
            }
            }
        
        return sum-count;
    }
}