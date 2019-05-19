import java.util.HashSet;
import java.util.Set;

/**
 * @Author: 杨斌
 * @Date: 2019/5/19 21:25
 * 滑动窗口
 */
public class LongestSubstring2 {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int i = 0, j = 0;
        int answer = 0;
        Set<Character> set = new HashSet<>();
        while (j < length) {
            if (set.add(s.charAt(j))) {
                j++;
                answer = Math.max(answer, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubstring2().lengthOfLongestSubstring(""));
    }
}
