class Solution {
    public int largestAltitude(int[] gain) {
        int l=0;
        int max=0;
        for(int i=0;i<gain.length;i++){
             l=l+gain[i];
             max=Math.max(l,max);
        }
        return max;
    }
}