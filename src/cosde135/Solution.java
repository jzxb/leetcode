package cosde135;

/**
 * @author lhx
 * @date 2019/9/15 - 11:55
 */
public class Solution {

    public static void main(String[] args) {
        int[] ratings = {1,0,2};
        System.out.println(candy(ratings));
    }

    public static int candy(int[] ratings) {
        if (ratings.length == 1) {
            return 1;
        }
        int[] candy = new int[ratings.length];
        int start = 1;
        int end = ratings.length - 2;
        int candySNum = 1;
        int candyENum = 1;
        while (start < ratings.length) {
            if (ratings[start] > ratings[start - 1]) {
                candySNum++;
            } else {
                candySNum = 1;
            }
            if (ratings[end] > ratings[end + 1]) {
                candyENum++;
            } else {
                candyENum = 1;
            }
            candy[start] = Math.max(candy[start], candySNum);
            candy[end] = Math.max(candy[end], candyENum);
            start++;
            end--;
        }
        int res = 0;
        for (int i = 0; i < candy.length; i++) {
            res += candy[i];
        }
        return res;
    }
}
