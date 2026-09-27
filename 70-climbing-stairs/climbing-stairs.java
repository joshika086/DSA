class Solution {
    public int climbStairs(int n) {
          int[] sum = new int[n + 1];
        // int sum=0;
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        sum[1]=1;
        sum[2]=2;
        for(int i=3;i<=n;i++){
           sum[i]=sum[i-1]+sum[i-2]; 
        }
        return sum[n];
    }
}