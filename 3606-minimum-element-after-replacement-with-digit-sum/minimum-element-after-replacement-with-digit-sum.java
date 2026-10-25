class Solution {
    public int minElement(int[] nums) {
       int arr[]=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        int sum=0;
        while(nums[i]>0){
           
            int digit=nums[i]%10;
         
             sum=sum+digit;
            nums[i]=nums[i]/10;
            // arr[i]=sum;
        }
        arr[i]=sum;
       }
        int max=arr[0];
     for(int i=0;i<arr.length;i++){
        max=Math.min(max,arr[i]);
     }
     return max;
    }
}