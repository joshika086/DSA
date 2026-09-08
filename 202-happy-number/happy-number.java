class Solution {
    public boolean isHappy(int n) {
        Set<Integer>arr=new HashSet<>();
        // int sum=0;
        while(n!=1){
          if(arr.contains(n)){
              return false;
          }
            arr.add(n);
                int sum=0;
        while(n>0){
            int temp=n%10;
            sum=temp*temp+sum;
            n=n/10;
        }
        n=sum;}
        return true;
    }
}