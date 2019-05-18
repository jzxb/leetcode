package code239;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lhx
 * @date 2019/5/18 - 14:31
 * 给定一个数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口 k 内的数字。滑动窗口每次只向右移动一位。
 *
 * 返回滑动窗口最大值。
 *
 * 示例:
 *
 * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
 * 输出: [3,3,5,5,6,7]
 * 解释:
 *
 *   滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 * 注意：
 *
 * 你可以假设 k 总是有效的，1 ≤ k ≤ 输入数组的大小，且输入数组不为空。
 */
public class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (null == nums || 2 > nums.length){
            return nums;
        }
        Deque<Integer> window = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            while (!window.isEmpty() && nums[window.peekLast()] < nums[i]){
                window.pollLast();
            }
            window.addLast(i);
            if(window.peek() <= i-k){
                window.poll();
            }
            if(i-k+1 >= 0){
                res[i-k+1] = nums[window.peek()];
            }
        }
        return res;
    }

}
