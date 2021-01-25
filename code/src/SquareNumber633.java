/**
 * @Author wxb
 * @Date 2021/1/25 20:54
 * @Version 1.0
 */

/**
 *  来源：力扣（LeetCode）
 *  链接：https://leetcode-cn.com/problems/sum-of-square-numbers
 * 633. 平方数之和
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c 。
 * 示例 1：
 *
 * 输入：c = 5
 * 输出：true
 * 解释：1 * 1 + 2 * 2 = 5
 * 示例 2：
 *
 * 输入：c = 3
 * 输出：false
 * 示例 3：
 *
 * 输入：c = 4
 * 输出：true
 *
 * 阶梯思路：
 *   可以看成 0^2 + x^2 = c
 *  x 最大取c 的平方根
 *  i^2 + j ^2 >c 说明 j 较大，j --
 *  i^2 + j^2 < c 说明 i 较小 ,i++;
 *
 * @author wxb
 *
 */
public class SquareNumber633 {

    public static boolean judgeSquareSum(int c) {
        int i = 0;
        int j = (int) Math.sqrt(c);
        while (i<=j){
            if(i*i + j*j ==c){
                return true;
            }else if( i * i + j * j > c){
                j--;
            }else if( i* i + j* j < c){
                i ++;
            }
            if( i > j){
                return false;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        judgeSquareSum(3);
    }
}
