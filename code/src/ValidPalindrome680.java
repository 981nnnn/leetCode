/**
 * @Author wxb
 * @Date 2021/1/27 21:32
 * @Version 1.0
 */
public class ValidPalindrome680 {
    public static boolean validPalindrome(String s) {
        for(int i= 0,j= s.length()-1;i<j;i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                return( isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1));
            }
        }
        return true;
    }

    public static boolean isPalindrome(String s, int i,int j){
        while (i<j){
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean abca = validPalindrome("abc");
        System.out.println(abca);
    }
}
