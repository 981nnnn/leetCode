import java.util.*;
import java.util.stream.Collectors;

/**
 * @author wxb
 * @version 1.0
 * @date 2021/2/3 11:02
 */
public class TopKFrequentElements347 {
    public static Integer[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        Set<Integer> integers = map.keySet();
        for (Integer integer : integers) {
            System.out.println(integer);
            System.out.println(integer+"====="+map.get(integer));
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                System.out.println("a=="+a+"map"+map.get(a)+"~~~"+"b=="+b+"map"+ map.get(b));
                return map.get(a) - map.get(b);
            }
        });

        for (Integer key : map.keySet()) {
            if (pq.size() < k) {
                pq.add(key);
            } else if (map.get(key) > map.get(pq.peek())) {
                pq.remove();
                pq.add(key);
            }
        }
        // 取出最小堆中的元素
        List res = new ArrayList<>();
        while (!pq.isEmpty()) {
            res.add(pq.remove());
        }

        return (Integer[]) res.toArray();


    }

    public static void main(String[] args) {
        int [] nums = {2,5,1,2,2,3};
        List ints1 = Arrays.asList(nums);
        Integer[] ints = topKFrequent(nums, 2);
    }
}
