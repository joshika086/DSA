class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
         int d=0;
            while(n>0){
              
                int digit=n%10;
                  d++;
                n=n/10;}
                if(d%2==0){
                    count++;
                }
            
        }
        return count;
    }
}