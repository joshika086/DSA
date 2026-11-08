class Solution {
    public int[] rearrangeArray(int[] nums) {
       int even[]=new int[nums.length/2];

         int odd[]=new int[nums.length/2];
         int ans[]=new int[nums.length];
         int k=0;
         int j=0;
         for(int i=0;i<nums.length;i++){
             if(nums[i]<0){
                 even[j]=nums[i];
                 j++;
             }
             else{
                 odd[k]=nums[i];
                 k++;
             }
         }
    for(int i=0;i<nums.length/2;i++){
         ans[i*2]=odd[i];
         ans[i*2+1]=even[i];
    }
    return ans;
    }
}