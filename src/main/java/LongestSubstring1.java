import java.util.HashSet;
import java.util.Set;

/**
 * @Author: 杨斌
 * @Date: 2019/5/19 20:50
 * 暴力
 */
public class LongestSubstring1 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }
        int length = s.length();
        int answer = 1;
        Set<Character> set;
        for (int i = 0; i < length - 1; i++) {
            set = new HashSet<>();
            set.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (set.add(s.charAt(j))) {
                    answer = Math.max(answer, j - i + 1);
                } else {
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubstring1().lengthOfLongestSubstring(""));
    }
}
