class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       Set<Character>arr=new HashSet<>();
       int count=0;
       for(char num:jewels.toCharArray()){
          arr.add(num);
       }
       for(char i:stones.toCharArray()){
        if(arr.contains(i)){
            count++;
        }
       }
       return count;
    }
}