package com.xb.nowcoder;

/**
 * @ClassName JZ2
 * @Description
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * 输入："We Are Happy"
 *
 * 返回值："We%20Are%20Happy"
 * @Author xb
 * @Date 2021/8/3 19:29
 * @Version 1.0
 **/
public class JZ2 {
  public static void main(String[] args) {
    String s = "We Are Happy";
    String s1 = replaceSpace(s);
    System.out.println(s1);

    System.out.println(replaceSpace1(s));
  }

  /**
   * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
   *
   *
   * @param s string字符串
   * @return string字符串
   */
  public static String replaceSpace (String s) {
    // write code here
    char[] chars = s.toCharArray();
    String r = "";
    for (char aChar : chars) {
      if(aChar==' '){
      r+="%20";
      }else{
        r+=aChar;
      }
    }
    return r;
  }

  public static String replaceSpace1(String s){
    char[] chars = s.toCharArray();
    StringBuilder sb = new StringBuilder();
    for (char aChar : chars) {
      if(aChar==' '){
        sb.append("%20");
      }else{
        sb.append(aChar);
      }
    }
    return sb.toString();
  }

  public static String replaceSpace2 (String s) {
    // write code here
   int length =s.length();
   char []array = new char[length*3];
   int index = 0;
    for (int i = 0; i <length ; i++) {
      if(s.charAt(i)==' '){
        array[index++] = '%';
        array[index++] = '2';
        array[index++] = '0';
      }else{
        array[index++] = s.charAt(i);
      }
    }

    return new String(array,0,index);
  }
}
