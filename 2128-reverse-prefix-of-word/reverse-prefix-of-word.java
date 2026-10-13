class Solution {
    public String reversePrefix(String word, char ch) {
   char arr[]=word.toCharArray();
//    if(index ==-1){
//     return -1;
//    }
   int index=-1;
   for(int i=0;i<arr.length;i++){
    if(arr[i]==ch){
        index=i;
        break;
    }}
     if(index ==-1){
    return word;
   }
    int left=0;
    int right=index;
    while(left<right){
        char temp=arr[right];
        arr[right]=arr[left];
        arr[left]=temp;
        left++;
        right--;
    }
   
   return new String(arr);
    }
}