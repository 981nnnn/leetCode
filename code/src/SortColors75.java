import java.util.Arrays;
import java.util.HashMap;

/**
 * @author wxb
 * @version 1.0
 * @date 2021/2/19 15:06
 *
 * 给定一个包含红色、白色和蓝色，一共n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 *
 * 此题中，我们使用整数 0、1 和 2 分别表示红色、白色和蓝色。
 *
 */
public class SortColors75 {
    public static void sortColors(int[] nums) {
        Arrays.sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int []nums = {2,0,2,1,1,0};
        sortColors(nums);
    }
}
