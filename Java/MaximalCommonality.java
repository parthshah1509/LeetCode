//MaximalCommonality

import java.util.Arrays;

public class MaximalCommonality {
    public static void main(String[] args) {
        String s1 = "abcdedeara";
        System.out.println(findMaxCommonality(s1));
    }

    private static int findMaxCommonality(String str) {
        int[] count = new int[26];
        for(char ch : str.toCharArray()) {
            count[ch-'a']++;
        }
        System.out.println(Arrays.toString(count));
        int res = 0;
        int cur = 0;
        for(int i=0; i<str.length(); ++i) {
            int c = count[str.charAt(i)-'a'];
            if(c > 1) {
                ++cur;
                c -= 2;
            } else if (c == 0) {
                --cur;
            } else {
                --c;
            }
            count[str.charAt(i)-'a'] = c;
            res = Math.max(cur, res);
        }
        return res;
    }
}
