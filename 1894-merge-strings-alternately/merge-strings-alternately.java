class Solution {

    public String mergeAlternately(String word1, String word2) {

        String merge = "";

        for(int i = 0; i < word1.length() && i < word2.length(); i++) {

            merge = merge + word1.charAt(i);
            merge = merge + word2.charAt(i);

        }

        for(int i = word2.length(); i < word1.length(); i++) {
            merge = merge + word1.charAt(i);
        }

        for(int i = word1.length(); i < word2.length(); i++) {
            merge = merge + word2.charAt(i);
        }

        return merge;
    }
}