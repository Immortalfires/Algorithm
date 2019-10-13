/**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {

        public ListNode mergeKLists(ListNode[] lists){
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
            ListNode[] a = new ListNode[mid];
            ListNode[] b = new ListNode[lists.length - mid];
            for(int i = 0;i < mid;i++){
                a[i] = lists[i];
            }
            for(int j = 0 ,i=mid;i < lists.length;j++,i++){
                b[j] = lists[i];
            }

            return addLists(mergeKLists(a),mergeKLists(b));
        }

        public ListNode addLists(ListNode a,ListNode b){
            if(a==null)
                return b;
            if(b==null){
                return a;
            }
            ListNode res = null;
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
}
