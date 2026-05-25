import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstringProblemHard {
    static String MinimumWindowSubstring(String s,String t){
        if (s.length() < t.length()) return "";
        int[] map = new int[128];
        for(char c: t.toCharArray()){
            map[c]++;
        }
        int right=0;
        int left=0;
        int count = t.length();

        int minLen = Integer.MAX_VALUE;
        int start = 0;
        while (right < s.length()) {
            char r = s.charAt(right);

            // Step 2: Expand window
            if (map[r] > 0) {
                count--;
            }
            map[r]--;
            right++;

            // Step 3: Shrink window
            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char l = s.charAt(left);
                map[l]++;

                if (map[l] > 0) {
                    count++;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? ""
                : s.substring(start, start + minLen);
    }

    static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t= "ABC";
        System.out.println(MinimumWindowSubstring(s,t));
    }
}





