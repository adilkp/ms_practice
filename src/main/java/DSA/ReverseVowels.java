package DSA;

/*
Reverse vowels of String : Input: s = "hello" Output: "holle"
Input: s = "leetcode" Output: "leotcede
 */
public class ReverseVowels {
    public static String reverseVowels(String s) {
        char c[] = s.toCharArray();
        int l=0,h=c.length-1;
        while(l<h) {
            if((c[h]=='a' || c[h]=='e' || c[h]=='i' || c[h]=='o' || c[h]=='u' || c[h]=='A' || c[h]=='E' || c[h]=='I' || c[h]=='O' || c[h]=='U') &&
                    (c[l]=='a' || c[l]=='e' || c[l]=='i' || c[l]=='o' || c[l]=='u' || c[l]=='A' || c[l]=='E' || c[l]=='I' || c[l]=='O' || c[l]=='U')) {
                char ch = c[l];
                c[l] = c[h];
                c[h] = ch;
                l++; h--;
            }
            else if(c[h]=='a' || c[h]=='e' || c[h]=='i' || c[h]=='o' || c[h]=='u' || c[h]=='A' || c[h]=='E' || c[h]=='I' || c[h]=='O' || c[h]=='U') {
                l++;
            }
            else if(c[l]=='a' || c[l]=='e' || c[l]=='i' || c[l]=='o' || c[l]=='u' || c[l]=='A' || c[l]=='E' || c[l]=='I' || c[l]=='O' || c[l]=='U') {
                h--;
            }
            else {l++; h--;}
        }
        return String.valueOf(c);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
