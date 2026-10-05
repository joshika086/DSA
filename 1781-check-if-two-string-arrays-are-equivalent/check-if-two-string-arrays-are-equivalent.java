class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String n1="";
        String n2="";
        for(int i=0;i<word1.length;i++){
            n1=n1+word1[i];
        }
        for(int i=0;i<word2.length;i++){
            n2=n2+word2[i];
        }
        return n1.equals(n2);
    }
}