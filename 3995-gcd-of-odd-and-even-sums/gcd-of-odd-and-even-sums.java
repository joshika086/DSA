class Solution {
    public int gcdOfOddEvenSums(int n) {
        int even=0;
        int odd=0;
        for(int i=1;i<=n;i++){
             even+=i*2;
             odd+=i*2-1;
        }
        int ans=1;
        if(even>odd){
            ans=even-odd;
        }
        else{
            ans=odd-even;
        }
        // for(int k=1;k<=even && k<=odd;k++){
        //     if(even%k==0 && odd%k==0){
        //         ans=k;
        //     }
        // }

        return ans ;
    }

}