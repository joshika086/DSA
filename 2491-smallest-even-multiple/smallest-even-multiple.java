class Solution {
    public int smallestEvenMultiple(int n) {
   
      for(int i=n;i<=n*2;i++){
        if(i%n==0 && i%2==0){
            return i;
        }
      }  
      return -1;
    }
}