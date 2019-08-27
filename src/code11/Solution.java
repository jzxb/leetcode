package code11;

/**
 * @author lhx
 * @date 2019/8/27 - 10:27
 *
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public static void main(String[] args) {
//        int[] height = {1,8,6,2,5,4,8,3,7};
//        int[] height = {2,3,4,5,18,17,6};
        int[] height = {1,1};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
//        int[][] areaArr = new int[height.length][height.length + 1];
//        for (int i = 1; i <= areaArr.length - 1; i++) {
//            for (int j = i + 1; j < areaArr[i].length; j++) {
//                int area = (height[i - 1] < height[j - 1] ? height[i - 1] : height[j - 1]) * (j - i);
//                areaArr[i][j] = area;
//            }
//        }
//        int res = 0;
//        for (int i = 0; i < areaArr.length; i++) {
//            for (int j = i + 1; j < areaArr[i].length; j++) {
//                if (areaArr[i][j] > res) {
//                    res = areaArr[i][j];
//                }
//            }
//        }
//        return res;
        int res = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            res = Math.max(res, Math.min(height[l], height[r]) * (r - l));
            if (height[l] > height[r]) {
                r--;
            } else {
                l++;
            }
        }
        return res;
    }

}
