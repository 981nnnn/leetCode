package com.xb.nowcoder;

/**
 * @ClassName JZ1
 * @Description 二维数组中的查找 在一个二维数组array中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * [ [1,2,8,9],
 *  [2,4,9,12],
 *  [4,7,10,13],
 *  [6,8,11,15] ] 给定
 * target = 7，返回 true。
 * <p>
 * 给定 target = 3，返回 false。
 * <p>
 * 0 <= array.length <= 500 0 <= array[0].length <= 500
 * @Author xb
 * @Date 2021/8/2 21:22
 * @Version 1.0
 **/
public class JZ1 {
  public static void main(String[] args) {
      int [][]array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};

    int [][]array1 = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
    System.out.println(Find(5, array1));

  }

  public static boolean Find(int target, int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int i1 = array[i].length ; i1> 0; i1--) {
        if(array[i][i1-1]<target){
          break;
        }else if(array[i][i1-1]==target){
          return true;
        }else{

        }
      }
    }
    return false;
  }
}
