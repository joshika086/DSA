class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // int arr[]=new int[n+m];
        int m=nums1.length;
        int n=nums2.length;
          int arr[]=new int[n+m];
        int k=0;
        for(int i=0;i<m;i++){
            arr[k]=nums1[i];
            k++;
        }    
        for(int j=0;j<n;j++){
            arr[k]=nums2[j];
            k++;
        }
        Arrays.sort(arr);
        int len=arr.length;
        double median=0;
        if(arr.length%2==0){
            median = (arr[len/2] + arr[len/2 - 1]) / 2.0;
        }
        else{
            median = arr[len/2];
        }
        return median;
    }
}