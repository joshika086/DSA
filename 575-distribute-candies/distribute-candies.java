class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer>arr=new HashSet<>();
        int count=0;
        for(int num:candyType){
            if(!arr.contains(num)){
                count++;
            }
            arr.add(num);
        }
       return Math.min(count, candyType.length / 2);

    }
}