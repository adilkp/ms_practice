package DSA;

/*
Maximum no. of vowels in a substring of given length
Input: s = "leetcode", k = 3 Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.
 */

public class MaxVowels {
    public static int maxVowels(String s, int k) {
        char c[] = s.toCharArray();
        System.out.println(c);
        char[] temp = new char[k];
        int ans=0;
        for(int i=0;i<k;i++) {
            temp[i]=c[i];
            if(temp[i]=='a' ||temp[i]=='e' ||temp[i]=='i' ||temp[i]=='o' ||temp[i]=='u') {
                ans++;
            }
        }
        int maxVowel = ans;
        for (int i=1;i<s.length()-k+1;i++) {
            if(c[i-1]=='a' || c[i-1]=='e' || c[i-1]=='i' || c[i-1]=='o' || c[i-1]=='u') {
                ans--;
            }
            if(c[i+k-1]=='a' || c[i+k-1]=='e' || c[i+k-1]=='i' || c[i+k-1]=='o' || c[i+k-1]=='u') {
                ans++;
            }
            maxVowel = Math.max(ans,maxVowel);
        }
        return maxVowel;
    }
    public static void main(String[] args) {
        String s = "weallloveyou";
        System.out.println(maxVowels(s,7));
    }
}
