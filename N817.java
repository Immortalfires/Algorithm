import java.util.HashSet;
import java.util.Set;

/**
 * @author:Aurevoir
 * @date: 2019/12/14  17:20
 *
 * 给定一个链表（链表结点包含一个整型值）的头结点 head。
 * 同时给定列表 G，该列表是上述链表中整型值的一个子集。
 * 返回列表 G 中组件的个数，这里对组件的定义为：
 * 链表中一段最长连续结点的值（该值必须在列表 G 中）构成的集合。
 */
class ListNode2{
    int val;
    ListNode2 next;
    ListNode2(int val) {
        this.val = val;
    }
}

public class N817 {
    public static void main(String[] args) {
        ListNode2 node1 = new ListNode2(0);
        ListNode2 node2 = new ListNode2(1);
        ListNode2 node3 = new ListNode2(2);
        ListNode2 node4 = new ListNode2(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        int[] G = new int[]{0,1,3};
        System.out.println(numComponents(node1,G));
    }

    private static int numComponents(ListNode2 head, int[] G) {
        if(G == null || head == null){
            return 0;
        }
        ListNode2 temp = head;
        Set<Integer> set = new HashSet<>();
        for(int i : G){
            set.add(i);
        }
        int count = 0;
        while(temp != null){
            if(set.contains(temp.val) && (temp.next == null || !set.contains(temp.next.val))){
                count ++;
            }
            temp = temp.next;
        }
        return count;
    }
}
