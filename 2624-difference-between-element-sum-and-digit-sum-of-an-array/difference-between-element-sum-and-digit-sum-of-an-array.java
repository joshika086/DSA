class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int ds=0;

    for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
        while(nums[i]>0){
            int digit=nums[i]%10;
            ds=ds+digit;
            nums[i]=nums[i]/10;
        }
    }
    return sum-ds;
    }
}