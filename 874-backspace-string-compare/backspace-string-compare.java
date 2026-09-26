class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>Stack=new Stack<>();
        Stack<Character>Stack1=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='#'){
                if(!Stack.isEmpty()){
                Stack.pop();
            }}
            else{
                Stack.push(ch);
            }
        }
        for(char c:t.toCharArray()){
           if(c=='#'){
            if(!Stack1.isEmpty()){
               Stack1.pop();
           } }
           else{
            Stack1.push(c);
           }
        }
         return Stack.equals(Stack1);
            }
}