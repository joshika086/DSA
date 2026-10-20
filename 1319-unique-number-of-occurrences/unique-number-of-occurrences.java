class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer>l=new HashSet<>();
      Map<Integer,Integer>map=new HashMap<>();
      for(int num:arr){
        map.put(num,map.getOrDefault(num,0)+1);
      }
      for(int num:map.values()){
        if(!l.add(num)){
            return false;
        }
      }
      return true;
        }
    }
