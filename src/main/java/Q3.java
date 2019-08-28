import java.util.Arrays;

/**
 * @ClassName: Q3
 * @Description:
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @auther: caiwei
 * @date: 2019/8/28 23:42
 */
public class Q3 {

    public static void main(String[] args) {
        String target = "abbcdef";
        System.out.println(lengthOfLongestSubstring(target));
    }

    static int lengthOfLongestSubstring(String s) {

        int result = 0;
        char[] chars = s.toCharArray();
        for (int from = 0; from < chars.length; from++) {
            for (int to = from+1; to <= chars.length; to++) {
                char[] tempChars = Arrays.copyOfRange(chars, from, to);
                int tempResult = getRepetitions(tempChars);
                if (tempResult == 1) {
                    if (tempChars.length > result) {
                        result = tempChars.length;
                    }
                }
            }
        }
        return result;
    }

    //求数组中某个元素最大的重复次数
    static int getRepetitions(char[] origin) {

        int result = 0;
        for (char c : origin) {
            int tempResult = 0;
            for (char c1 : origin) {
                if (c == c1) {
                    tempResult++;
                }
            }
            if (tempResult > result) {
                result = tempResult;
            }
        }
        return result;
    }

}
