import java.util.HashSet;
import java.util.Set;

/**
 * TODO
 *
 * @auther caiwei
 * @date 2019-12-31
 */
public class Q14 {

    public static void main(String[] args) {
        String[] strs = new String[]{"aca","cba"};
        System.out.println(longestCommonPrefix(strs));
    }


    /**
     * 自己的
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {

        int little =0;
        for (int i = 0; i < strs.length; i++) {

            if (i == 0) {
                little = strs[i].length();
                continue;
            }
            if (little > strs[i].length()) {
                little = strs[i].length();
            }
        }
        Set<Character> contains = new HashSet<Character>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < little; i++) {
            for (String string : strs) {
                char letter =string.toCharArray()[i];
                contains.add(letter);
            }
            if (contains.size() == 1) {
                stringBuilder.append(contains.toArray()[0]);
            }else {
                break;
            }
            contains.clear();
        }
        return stringBuilder.toString();
    }

    /**
     * 官方的
     * @param strs
     * @return
     */
    public String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

}
