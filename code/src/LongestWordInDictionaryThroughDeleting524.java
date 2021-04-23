import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author wangxiaobao
 */
public class LongestWordInDictionaryThroughDeleting524 {


    public static String findLongestWord(String s, List<String> d) {
        String flag = "";
        for (int i = 0; i < d.size(); i++) {
            String str = findStr(d.get(i),targetList(s));
            if(str.length()>flag.length()){
                flag = str;
            }
        }
        return flag;
    }

    private static String findStr( String listString, ArrayList<Character> characters){
        char[] tarGetChar = listString.toCharArray();

        int i = 0;
        int j = 0;
        while (i<listString.length()){
            if(tarGetChar[i]==characters.get(j)){
                characters.remove(j);
                i++;
                j=0;
            }else{
                j++;
            }
            if(j==characters.size()&& characters.size()!=0){
                return "";
            }
        }

        return listString;
    }
    private static ArrayList<Character> targetList(String target){
        char[] tarGetChar = target.toCharArray();
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < tarGetChar.length; i++) {
            characters.add(tarGetChar[i]);
        }
        return characters;
    }


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("aa");
        list.add("aaa");
        //list.add("plea");
        String string = "aaa";
        String longestWord = findLongestWord(string, list);
        System.out.println(longestWord);
    }
}
