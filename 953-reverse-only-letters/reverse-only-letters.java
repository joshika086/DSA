
class Solution {

    public String reverseOnlyLetters(String s) {

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Skip non-letter from left
            if (!((arr[left] >= 'a' && arr[left] <= 'z') ||
                  (arr[left] >= 'A' && arr[left] <= 'Z'))) {

                left++;
                continue;
            }

            // Skip non-letter from right
            if (!((arr[right] >= 'a' && arr[right] <= 'z') ||
                  (arr[right] >= 'A' && arr[right] <= 'Z'))) {

                right--;
                continue;
            }

            // Both are letters → swap
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}
