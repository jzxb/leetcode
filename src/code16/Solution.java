package code16;

import java.util.Arrays;

/**
 * @author lhx
 * @date 2019/8/27 - 18:02
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 *
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum-closest
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        System.out.println(threeSumClosest(nums, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
//        if (nums == null || nums.length < 3) {
//            throw new RuntimeException("数组有误");
//        }
//        int i = 0;
//        int j = 1;
//        int k = 2;
//        int res = nums[i] + nums[j] + nums[k];
//        while (i <= nums.length - 3) {
//            int temp = nums[i] + nums[j] + nums[k];
//            if (Math.abs(res - target) > Math.abs(temp - target)) {
//                res = temp;
//            }
//            k++;
//            if (k > nums.length - 1 && j != nums.length - 2) {
//                j++;
//                k = j + 1;
//            } else if (k > nums.length - 1 && j == nums.length - 2) {
//                i++;
//                j = i + 1;
//                k = j + 1;
//            }
//        }
//        return res;
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int temp = nums[i] + nums[j] + nums[k];
                if (Math.abs(res - target) > Math.abs(temp - target)) {
                    res = temp;
                }
                if (temp > target) {
                    k--;
                } else if (temp < target) {
                    j++;
                } else {
                    return res;
                }
            }
        }
        return res;
    }

}
