import java.util.HashSet;
import java.util.Set;

/**
 * @Author wxb
 * @Date 2021/1/28 19:53
 * @Version 1.0
 * 方法一：哈希表
 * 思路及算法
 *
 * 最容易想到的方法是遍历所有节点，每次遍历到一个节点时，判断该节点此前是否被访问过。
 *
 * 具体地，我们可以使用哈希表来存储所有已经访问过的节点。每次我们到达一个节点，如果该节点已经存在于哈希表中，则说明该链表是环形链表，否则就将该节点加入哈希表中。重复这一过程，直到我们遍历完整个链表即可。
 *
 * 思路：
 * hashSet.add() 方法：如果这个元素未包含这个元素，则返回true，
 * 如果包含这个元素就会返回false
 *
 * 从头开始遍历这个ListNode，如果不存在将其加入Set集合，
 * 如果在Set中已经存在，说明已经访问过，返回false，这是一个环形链表
 */
public class LinkedListCycle141 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> hashSet = new HashSet<ListNode>();
        while (head != null){
            if(!hashSet.add(head)){
                return true;
            }
            head = head.next;
        }
        return false;
    }

    class ListNode {
     int val;
     ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }
}
