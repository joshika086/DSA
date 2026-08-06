class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
        int prd=1;
        int temp=n;
       while(temp>0){
        int d=temp%10;
           prd=prd*d;
           temp=temp/10;
       }
       if(prd%t==0){
        return n;
       }
     n++;
        }
    }
}