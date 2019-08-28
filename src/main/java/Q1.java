import java.util.Arrays;

/**
 * @ClassName: Q1
 * @Description:
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @auther: caiwei
 * @date: 2019/8/28 23:07
 */
public class Q1 {

    public static void main(String[] args) {
        int[] origin = {1,2,3,5,8,13,21,34,55,89};
        int target = 10;
        System.out.print(Arrays.toString(twoSum(origin, target)));

    }

    private static int[] twoSum(int[] origin, int target) {

        int[] result = new int[2];

        for(int i = 0; i < origin.length; i++){
            for (int j = i+1; j < origin.length; j++) {
                if ((origin[i] + origin[j]) == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }


}
