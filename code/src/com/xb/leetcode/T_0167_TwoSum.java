package com.xb.leetcode;

/**
 * @ClassName TwoSum_167
 * @Description TODO
 * @Author xb
 * @Date 2021/6/29 16:06
 * @Version 1.0
 **/
public class T_0167_TwoSum {
    /**
     * 常规思路：
     * 从数组i=0 开始，由 j = i + 1 ； 判断 num[i] + num[j] == target
     * 循环 一轮，i++；
     *
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    return result;
                }
            }
        }
        return result;
    }

    /**
     * i = 0 开始， j = length -1 开始，
     * 如果 num[i] + num[j] < target , i++
     * 如果 num[i] + num[j] > target  , j--；
     * 如果 num[i] + num[j] = target ; 返回
     * 如果没有找到，返回空
     *
     * 时间复杂度：O(n)O(n)，其中 nn 是数组的长度。两个指针移动的总次数最多为 nn 次。
     *
     * 空间复杂度：O(1)O(1)。
     * @return
     */
    public static int[] twoSum2(int[] numbers, int target) {
        int[] result = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {
                return new int[]{i + 1, j + 1};
            }
        }
        return result;
    }

    /**
     * 使用二分法查找
     * 举例：
     * 数组中 1， 2 ，4， 5， 6
     *   下标：0 ，1， 2， 3， 4
     *  第一次循环从 i=0开始，low = 1； high = 4；mid = 2，比较 num[i] + num[mid] = sum 与 target 的值 ，
     *  如果 sum < target, low 向后移一位，mid就向后移一位。直到找到，找不到跳出循环。
     *  如果 sum > target ,high 向前移动一位，mid就向前移动一位，直到找到，找不到则跳出本次循环。
     *
     *  元素较多的时候，使用这种方法更快， 时间复杂度wei O(nlogn)，其中 nn 是数组的长度。需要遍历数组一次确定第一个数，时间复杂度是 O(n)O(n)，寻找第二个数使用二分查找，时间复杂度是 O(\log n)O(logn)，因此总时间复杂度是 O(n \log n)O(nlogn)。
     *
     *
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum3(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int low = i+1;
            int high = numbers.length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if(numbers[mid] + numbers[i] == target){
                    return  new int[]{i+1,mid+1};
                }else if(numbers[mid] + numbers[i] > target){
                    high = mid -1;
                }else {
                    low = mid +1;
                }
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 6};
        int[] ints = twoSum(numbers, 11);
        System.out.println(ints[0] + "-" + ints[1]);

        int[] ints2 = twoSum2(numbers, 7);
        System.out.println(ints2[0] + "-" + ints2[1]);


        int[] twoSum3 = twoSum3(numbers, 10);
        System.out.println(twoSum3[0]+"-"+twoSum3[1]);
    }

}
