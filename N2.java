class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2(int x) {
        val = x;
    }
}


public class N2 {
    public static void main(String[] args) {
        ListNode2 n11=new ListNode2(2);
        ListNode2 n12=new ListNode2(4);
        ListNode2 n13=new ListNode2(3);
        n11.next=n12;
        n12.next=n13;
        ListNode2 n21=new ListNode2(5);
        ListNode2 n22=new ListNode2(6);
        ListNode2 n23=new ListNode2(4);
        n21.next=n22;
        n22.next=n23;
        ListNode2 res=addTwoNumbers(n11,n21);
        while(res!=null) {
            System.out.print(res.val);
            res = res.next;
        }
    }

    private static ListNode2 addTwoNumbers(ListNode2 l1, ListNode2 l2) {
        ListNode2 res = new ListNode2(0);
        ListNode2 p = l1, q = l2, curr = res;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode2(sum % 10);
            curr = curr.next;
            if (p != null)
                p = p.next;
            if (q != null)
                q = q.next;
        }
        if(carry!=0)
            curr.next=new ListNode2(carry);
        return res.next;
    }
}
