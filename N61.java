/**
 * @author:Aurevoir
 * @date: 2019/11/27  16:05
 */
/*
给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
示例 1:
输入: 1->2->3->4->5->NULL, k = 2
输出: 4->5->1->2->3->NULL
解释:
向右旋转 1 步: 5->1->2->3->4->NULL
向右旋转 2 步: 4->5->1->2->3->NULL
 * public class ListNode61 {
 *     int val;
 *     ListNode61 next;
 *     ListNode61(int x) { val = x; }
 * }
 */
class ListNode61 {
    int val;
    ListNode61 next;

    public ListNode61() {
    }

    ListNode61(int x){
        this.val = x;
    }
}



public class N61 {
    public static void main(String[] args) {
        ListNode61 head1 = new ListNode61(1);
        ListNode61 head2 = new ListNode61(2);
        ListNode61 head3 = new ListNode61(3);
        ListNode61 head4 = new ListNode61(4);
        ListNode61 head5 = new ListNode61(5);
        head1.next = head2;
        head2.next = null;

        int k = 2;
        ListNode61 res = rotateRight(head1,k);
        while(res!=null){
            System.out.println(res.val);
            res = res.next;
        }
    }

    private static ListNode61 rotateRight(ListNode61 head, int k) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        ListNode61 temp = head;
        int count = 1;
        for(;temp.next != null;count++){
            temp = temp.next;
        }
        temp.next = head;


        ListNode61 temp1 = head;
        if(k == 0){
            temp.next = null;
            return head;
        }
        if(k==count){
            temp.next = null;
            return head;
        }
        for(int i = 0;i < count - k % count - 1;i++){
            temp1 = temp1.next;
        }
        ListNode61 temp2 = temp1.next;
        temp1.next = null;
        return temp2;
    }
}
