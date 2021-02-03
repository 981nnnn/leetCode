import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author wangxiaobao
 */
public class LongestWordInDictionaryThroughDeleting524 {


    public static String findLongestWord(String s, List<String> d) {
        String longstr = "";
        for (String targetStr : d){
            int l1 = longstr.length();
            int l2 = targetStr.length();
            if(l1>l2 || (l1==l2 & longstr.compareTo(targetStr)<0)){
                continue;
            }
            if(findStr(s,targetStr)){
                longstr = targetStr;
            }
        }
        return longstr;
    }

    /**
     * 判断str 中是否在sourceString中
     * @param sourceString  主函数传递的str
     * @param targetString  list中的str
     * @return
     */
    private static Boolean findStr( String sourceString, String targetString){
        int i = 0;
        int j = 0;
        while(i<sourceString.length() && j < targetString.length()){
            if(sourceString.charAt(i) == targetString.charAt(j)){
                j++;
            }
            i++;
        }
        // 如果返回true，target在sourceString 中
        return j == targetString.length();
    }


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("ewaf");
        list.add("awefawfwaf");
        list.add("awef");
        list.add("awefe");
        list.add("ewafeffewafewf");
        String string = "aewfafwafjlwajflwajflwafj";
        String longestWord = findLongestWord(string, list);
        System.out.println(longestWord);
    }
}
