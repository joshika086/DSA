class Solution {
    public int[] leftRightDifference(int[] nums) {
       int right=0;
       int left=0;
       int arr[]=new int[nums.length];

       for(int i=0;i<nums.length;i++){
        right+=nums[i];
       }
       for(int i=0;i<nums.length;i++){
       
        right=right-nums[i];
        //   /      left=left+nums[i];

        arr[i]=Math.abs(right-left);
         left=left+nums[i];
       }
       return arr;
    }
}