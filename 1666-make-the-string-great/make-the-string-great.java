class Solution { 
    public String makeGood(String s) { 
        Stack<Character> stack = new Stack<>(); 

        for(char ch : s.toCharArray()) { 
            if(!stack.isEmpty() &&
               Character.toLowerCase(stack.peek()) == Character.toLowerCase(ch) &&
               Character.isLowerCase(stack.peek()) != Character.isLowerCase(ch)) {
                
                stack.pop(); 
            } 
            else { 
                stack.push(ch); 
            } 
        }   

        String result = ""; 

        for(char ch : stack) { 
            result = result + ch; 
        } 

        return result; 
    } 
}