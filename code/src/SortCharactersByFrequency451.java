import java.util.*;

/**
 * @author wxb
 * @version 1.0
 * @date 2021/2/19 14:34
 * 给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
 *
 * 示例 1:
 *
 * 输入:
 * "tree"
 *
 * 输出:
 * "eert"
 *
 * 解释:
 * 'e'出现两次，'r'和't'都只出现一次。
 * 因此'e'必须出现在'r'和't'之前。此外，"eetr"也是一个有效的答案。
 *
 */
public class SortCharactersByFrequency451 {
    public static String frequencySort(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            map.put(aChar,map.getOrDefault(aChar,0)+1);
        }
        System.out.println(map.get('a'));

        List<Map.Entry<Character, Integer>> list = new ArrayList(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            // 默认的是从小到大排序，
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                // 从大到小排序
                // return (o2.getValue() - o1.getValue());
                // 从小到大排序
                return -(o1.getValue() - o2.getValue());
            }
        });
        StringBuilder sb = new StringBuilder();
        // 输出排序后的结果
        for (Map.Entry<Character, Integer> t : list) {
            for(int i = 0; i<t.getValue();i++){
                sb.append(t.getKey());
            }
            System.out.println(t.getKey() + ":" + t.getValue());
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        String result = frequencySort("aaannnverdd");
        System.out.println("结果-----"+result);
    }
}
