package com.xb.greedyThought;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wxb
 * @version 1.0
 * @date 2021/2/19 15:56
 *
 * @link  https://leetcode-cn.com/problems/assign-cookies/description/
 * 假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。
 *
 * 对每个孩子 i，都有一个胃口值g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j，都有一个尺寸 s[j]。
 * 如果 s[j]>= g[i]，我们可以将这个饼干 j 分配给孩子 i ，
 * 这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
 *
 *
 *
 */
public class AssignCookies455 {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result  = 0;
        List<Integer> list = Arrays.stream(s).boxed().collect(Collectors.toList());
        for (int i : g){
            if(list.contains(i)){
                result++;
                list.remove(new Integer(i));
                continue;
            }
            for (Integer integer : list) {
                if(integer>i){
                    result++;
                    list.remove(integer);
                    break;
                }
            }
        }
        return result;
    }

    public static int findContentChildren2(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0 ;
        int j = 0;
        while (i<g.length && j<s.length){
            if(g[i]<=s[j]){
                i++;
            }
            j++;
        }
        return i;
    }


    public static void main(String[] args) {
        int [] g  = {10,9,8,7};
        int [] s = {5,6,7,8};
        int contentChildren = findContentChildren(g, s);
        int contentChildren2 = findContentChildren2(g, s);
        System.out.println(contentChildren);
        System.out.println(contentChildren2);
    }
}
