class Solution {
    public int[] findErrorNums(int[] nums) {
   Set<Integer>arr=new HashSet<>();
    int missing=-1;
    int duplicate=-1;
    for(int num:nums){
        if(arr.contains(num)){
            duplicate=num;
        }
        arr.add(num);
    }
    for(int i=1;i<=nums.length;i++){
        if(!arr.contains(i)){
            missing=i;
        }

    }
       
        return new int[]{duplicate, missing};

    }
}