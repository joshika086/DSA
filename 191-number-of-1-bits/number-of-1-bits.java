class Solution {
    public int hammingWeight(int n) {
        int sum=0;
        String binary = Integer.toBinaryString(n);
        for(int num:binary.toCharArray()){
       if(num=='1'){
        sum++;
       }
        }
        return sum;
    }
}