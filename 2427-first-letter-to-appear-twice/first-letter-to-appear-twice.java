class Solution {
    public char repeatedCharacter(String s) {
        Set<Character>arr=new HashSet<>();
        for(char i:s.toCharArray()){
            // char ch=s.charAt(i);
            if(arr.contains(i)){
                return i;
            }
             arr.add(i);
        }
         return ' ';
    }
}