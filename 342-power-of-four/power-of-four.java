class Solution {
    public boolean isPowerOfFour(int n) {
    int i=0;
    while((long)Math.pow(4,i)<=n){
        if((long)Math.pow(4,i)==n){
            return true;
        }
        i++;
    }
    return false;
      }
    
}