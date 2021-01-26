import com.sun.deploy.util.StringUtils;
import com.sun.javafx.binding.StringFormatter;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @Author wxb
 * @Date 2021/1/26 20:33
 * @Version 1.0
 *
 * 链接：https://leetcode-cn.com/problems/reverse-vowels-of-a-string/
 * 345. 反转字符串中的元音字母
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 *
 * 示例 1：
 *
 * 输入："hello"
 * 输出："holle"
 * 示例 2：
 *
 * 输入："leetcode"
 * 输出："leotcede"
 *
 *
 * 提示：
 *
 * 元音字母不包含字母 "y" 。
 */
public class ReverseVowelsofaString345 {

    private final static HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    );

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        char[] chars1 = new char[chars.length];
        int i = 0;
        int j = chars.length - 1;
        while (i <= j) {
            if (!vowels.contains(chars[i])) {
                chars1[i] = chars[i];
                i++;
                continue;
            }
            if (!vowels.contains(chars[j])) {
                chars1[j] = chars[j];
                j--;
                continue;
            }
            chars1[i] = chars[j];
            chars1[j] = chars[i];
            i++;
            j--;
        }
        return new String(chars1);
    }


    public static void main(String[] args) {
        String baaaeu = reverseVowels("baaaeu");
        System.out.println(baaaeu);
    }


}
