class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer>l=new Stack<>();
       for(String c : operations){
       
        if(c.equals("C")){
            l.pop();
        }
        if(c.equals("D")){
           int score=l.peek();
           l.push(score*2);
        }
        if(c.equals("+")){
            int first = l.pop();   
             int second = l.peek(); 

             int sum = first + second;  

             l.push(first);         
            l.push(sum);           
        }

            if (!c.equals("C") && !c.equals("D") && !c.equals("+")) {
                l.push(Integer.parseInt(c));
            }

       } 
          int result = 0;

        for (int score : l) {
            result += score;
        }

        return result;
    }
}