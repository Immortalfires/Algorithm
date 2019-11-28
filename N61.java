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
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ListNode{
    int val;
    ListNode next;

    public ListNode() {
    }

    ListNode(int x){
        this.val = x;
    }
}



public class N61 {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(5);
        head1.next = head2;
        head2.next = null;

        int k = 2;
        ListNode res = rotateRight(head1,k);
        while(res!=null){
            System.out.println(res.val);
            res = res.next;
        }
    }

    private static ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        ListNode temp = head;
        int count = 1;
        for(;temp.next != null;count++){
            temp = temp.next;
        }
        temp.next = head;


        ListNode temp1 = head;
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
        ListNode temp2 = temp1.next;
        temp1.next = null;
        return temp2;
    }
}
