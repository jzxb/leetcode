package code20;

import java.util.*;

/**
 * @author lhx
 * @date 2019/3/20 - 19:07
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 */
public class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> charMap = new HashMap<>();
        charMap.put('}', '{');
        charMap.put(']', '[');
        charMap.put(')', '(');
        char [] stack = new char[s.length()];
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            if (charMap.containsValue(s.charAt(i))) {
                stack[++top] = s.charAt(i);
            }
            if (charMap.containsKey(s.charAt(i))) {
                if (top == -1 || stack[top--] != charMap.get(s.charAt(i))) {
                    return false;
                }
            }
        }
        return top == -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "(([]){})";
        System.out.println(solution.isValid(s));
    }
}
