class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>l=new Stack<>();
        for(char c:s.toCharArray()){
            if(l.isEmpty()){
                l.push(c);
            }
            else if(c==l.peek()){
                l.pop();
            }
            else{
                l.push(c);
            }
        }
        String result="";
        for(char c:l){
            result=result+c;
        }
        return result;
            }
}