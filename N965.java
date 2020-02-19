import java.util.List;

/**
 * @author:Aurevoir
 * @date: 2020/2/19  18:57
 */

class TreeNode965 {
    int val;
    TreeNode965 left;
    TreeNode965 right;
    TreeNode965(int x){
        val = x;
    }
 }



public class N965 {
    public static void main(String[] args) {
        TreeNode965 node1 = new TreeNode965(1);
        TreeNode965 node2 = new TreeNode965(1);
        TreeNode965 node3 = new TreeNode965(1);
        TreeNode965 node4 = new TreeNode965(1);
        TreeNode965 node5 = new TreeNode965(1);
        TreeNode965 node6 = new TreeNode965(1);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;
        System.out.println(isUnivalTree(node1));
    }

    private static boolean isUnivalTree(TreeNode965 root) {
        int num = root.val;
        boolean left = (root.left==null ||(num == root.left.val &&isUnivalTree(root.left)));
        boolean right = (root.right==null ||(num == root.right.val &&isUnivalTree(root.right)));
        return left && right;
    }
}
