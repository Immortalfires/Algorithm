/**
 * @author:Aurevoir
 * @date: 2020/1/21  16:55
 * 给定一个二叉树，原地将它展开为链表。
 *  * Definition for a binary tree node.
 *  * public class TreeNode {
 *  *     int val;
 *  *     TreeNode left;
 *  *     TreeNode right;
 *  *     TreeNode(int x) { val = x; }
 *  * }
 *  *
 */
class TreeNode1{
    int val;
    TreeNode1 left;
    TreeNode1 right;
    TreeNode1(int x){
        val = x;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode1 getLeft() {
        return left;
    }

    public void setLeft(TreeNode1 left) {
        this.left = left;
    }

    public TreeNode1 getRight() {
        return right;
    }

    public void setRight(TreeNode1 right) {
        this.right = right;
    }
}


public class N114 {
    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(1);
        TreeNode1 node1 = new TreeNode1(2);
        TreeNode1 node2 = new TreeNode1(3);
        TreeNode1 node3 = new TreeNode1(4);
        TreeNode1 node4 = new TreeNode1(5);
        TreeNode1 node5 = new TreeNode1(6);
        root.setLeft(node1);
        root.setRight(node4);
        node1.setLeft(node2);
        node1.setRight(node3);
        node4.setRight(node5);
        flatten(root);
    }


    private static void flatten(TreeNode1 root) {
        TreeNode1 pre = null;
        if(root==null){
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.right=null;
        root.left=pre;
        pre=root;
    }
}
