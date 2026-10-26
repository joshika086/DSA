class Solution {
    public String reversePrefix(String s, int k) {
       String w="";
       for(int i=k-1;i>=0;i--){
        w=w+s.charAt(i);
       } 
       for(int i=k;i<s.length();i++){
        w=w+s.charAt(i);
       }
       return w;
    }
}