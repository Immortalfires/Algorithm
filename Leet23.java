/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 */

class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1(int x){
        this.val = x;
    }
}

class Solution1 {

    public ListNode1 mergeKLists(ListNode1[] lists){
        if(lists.length == 0){
            return null;
        }
        if(lists.length == 1){
            return lists[0];
        }
        if(lists.length == 2){
            return addLists(lists[0],lists[1]);
        }

        int mid = lists.length - 1;
        ListNode1[] a = new ListNode1[mid];
        ListNode1[] b = new ListNode1[lists.length - mid];
        for(int i = 0;i < mid;i++){
            a[i] = lists[i];
        }
        for(int j = 0 ,i=mid;i < lists.length;j++,i++){
            b[j] = lists[i];
        }

        return addLists(mergeKLists(a),mergeKLists(b));
    }

    public ListNode1 addLists(ListNode1 a,ListNode1 b){
        if(a==null)
            return b;
        if(b==null){
            return a;
        }
        ListNode1 res = null;
        if(a.val < b.val){
            res = a;
            res.next = addLists(a.next,b);
        }else{
            res = b;
            res.next = addLists(b.next,a);
        }
        return res;
    }
}
