import java.util.Arrays;

/**
 * @author wxb
 * @version 1.0
 * @date 2021/2/3 10:44
 *
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 *
 * 连接：https://leetcode-cn.com/problems/kth-largest-element-in-an-array/description/
 *
 *思路：先排序，然后取值
 */
public class KthLargestElementInAnArray215 {
    public static  int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }

    public static void main(String[] args) {
        int [] nums = {3,2,1,5,6,4};
        int kthLargest = findKthLargest(nums, 2);
        System.out.println(kthLargest);
    }
}
