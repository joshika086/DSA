class Solution {
    public boolean checkIfPangram(String sentence) {
     Set<Character>l=new HashSet<>();
     for(char num:sentence.toCharArray()){
        l.add(num);
     }   
     return l.size() == 26;
    }
}