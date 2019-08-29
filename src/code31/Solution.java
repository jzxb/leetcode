package code31;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author lhx
 * @date 2019/8/29 - 14:18
 *
 * 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 *
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 *
 * 必须原地修改，只允许使用额外常数空间。
 *
 * 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/next-permutation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1};
        nextPermutation(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void nextPermutation(int[] nums) {
        int index = nums.length - 2;
        while (index >= 0 && nums[index + 1] <= nums[index]) {
            index--;
        }
        if (index >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[index]) {
                j--;
            }
            swap(nums, index, j);
        }
        int l = index + 1;
        int r = nums.length - 1;
        while (l < r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }

    private static void swap(int[] nums, int mark, int index) {
        int temp = nums[mark];
        nums[mark] = nums[index];
        nums[index] = temp;
    }

}
