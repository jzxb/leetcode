package code242;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lhx
 * @date 2019/5/19 - 11:04
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 *
 * 示例 1:
 *
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 *
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 */
public class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        int[] sCounts = new int[26];
        int[] tCounts = new int[26];
        for (char ch : s.toCharArray()){
            sCounts[ch - 'a']++;
        }
        for (char ch : t.toCharArray()){
            tCounts[ch - 'a']++;
        }
        for (int i = 0;i < 26;i++){
            if (sCounts[i] != tCounts[i]){
                return false;
            }
        }
        return true;

//        Map<Character, Integer> map = new HashMap<>();
//        for (char ch : s.toCharArray()) {
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//        for (char ch : t.toCharArray()) {
//            Integer count = map.get(ch);
//            if (count == null) {
//                return false;
//            } else if (count > 1) {
//                map.put(ch, count - 1);
//            } else {
//                map.remove(ch);
//            }
//        }
//        return map.isEmpty();

//        if(s.length()!=t.length()){
//            return false;
//        }
//        char[] as=s.toCharArray();
//        char[] ts=t.toCharArray();
//        Arrays.sort(as);
//        Arrays.sort(ts);
//        return Arrays.equals(as,ts);
    }

}
