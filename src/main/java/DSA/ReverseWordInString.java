package DSA;

/*
Reverse word in string
Example 1:Input: s = "the sky is blue" Output: "blue is sky the"
 */
public class ReverseWordInString {
    public static String reverseWords(String s) {
        //Uncomment below line to pass all leetcode test cases...
        //String[] list = s.trim().split("\\s+");
        String[] list = s.split(" ");
        String ans="";
        int n = list.length;
        for(int i= 0;i<n/2;i++) {
            String t = list[i];
            list[i] = list[n-i-1];
            list[n-i-1] = t;
        }
        for(int i=0;i<n-1;i++) {
            ans+=list[i]+" ";
        }
        ans+=list[n-1];
        return ans;
    }
    public static void main(String[] args) {
        String s ="the sky is blue";
        System.out.println(reverseWords(s));
    }
}
