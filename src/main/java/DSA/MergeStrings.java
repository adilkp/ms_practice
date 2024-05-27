package DSA;

/*
Merge strings alternatively : Input: word1 = "abc", word2 = "pqrst" Output: "apbqcr"
 */
public class MergeStrings {
    public static void main(String[] args) {
        String word1 = "abcdefghijk";
        String word2 = "pqrstu";
        String ans="";
        int i=0,j=0;
        while(i<word1.length() && j<word2.length()) {
            ans+= word1.charAt(i);
            ans+= word2.charAt(j);
            i++;
            j++;
        }
        while (i<word1.length()) {
            ans+= word1.charAt(i);
            i++;
        }
        while (j<word2.length()) {
            ans+= word2.charAt(j);
            j++;
        }
        System.out.println(ans);
    }
}
