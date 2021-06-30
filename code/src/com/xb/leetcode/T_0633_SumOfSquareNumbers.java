package com.xb.leetcode;

/**
 * @ClassName T_0633_SumOfSquareNumbers
 * @Description TODO
 * @Author xb
 * @Date 2021/6/30 9:43
 * @Version 1.0
 **/
public class T_0633_SumOfSquareNumbers {
    /**
     * 思路：
     * i = 0 开始 ， j = (int) Math.sqrt(c); 开始， 判断 i * i + j*j  = k 与 c 的大小
     * 如果 k > c, j --
     * 如果 k  < c, i++
     * 如果 k = c, return true;
     *
     * @param c
     * @return
     */
    public static boolean judgeSquareSum(int c) {
        if(c == 0 ||c == 1){
            return true;
        }
        int i = 0;
        int j = (int) Math.sqrt(c);
        while (i <= j) {
            long k = (long) i * i + (long) j * j;
            if (k > c) {
                j--;
            } else if (k < c) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }

    /**
     *暴力方法：
     *  int i  = 0 ; int j = 0;
     *
     * @param c
     * @return
     */
    public static boolean judgeSquareSum2(int c) {
        if(c == 0 ||c == 1){
            return true;
        }
        for(int i = 0 ; i<c ;i++){
            for(int j = i ; j < c ;j++){
                if(i * i + j * j  == c){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean judgeSquareSum3(int c){
        if (c<=2) {
            return true;
        }
        // 能被三整除的数字 ，就会有两个整数 平方之和等于 c
        if ((c&3)==3) {
            return false;
        }
        while ((c&1)==0) {
            c>>=1;
        }
        for (int i=3;i*i<=c;i+=2){
            if (c%i==0 && (c&3)==3) {
                return false;
            }
            while (c%i==0) {
                c/=i;
            }
        }
        return (c & 3) != 3;

    }


    public static boolean judgeSquareSum4(int c) {
        for (int base = 2; base * base <= c; base++) {
            // 如果不是因子，枚举下一个
            if (c % base != 0) {
                continue;
            }

            // 计算 base 的幂
            int exp = 0;
            while (c % base == 0) {
                c /= base;
                exp++;
            }

            // 根据 Sum of two squares theorem 验证
            if (base % 4 == 3 && exp % 2 != 0) {
                return false;
            }
        }

        // 例如 11 这样的用例，由于上面的 for 循环里 base * base <= c ，base == 11 的时候不会进入循环体
        // 因此在退出循环以后需要再做一次判断
        return c % 4 != 3;
    }



    public static void main(String[] args) {
        System.out.println(judgeSquareSum4(10));


    }
}
