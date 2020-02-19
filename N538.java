/**
 * @author:Aurevoir
 * @date: 2020/2/19  19:29
 *
 * 给定一个二叉搜索树（Binary Search Tree）
 * 把它转换成为累加树（Greater Tree)
 * 使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
 *
 * 例如：
 *
 * 输入: 二叉搜索树:
 *               5
 *             /   \
 *            2     13
 *
 * 输出: 转换为累加树:
 *              18
 *             /   \
 *           20     13
 */
public class N538 {
    public static void main(String[] args) {
        TreeNode965 node1 = new TreeNode965(5);
        TreeNode965 node2 = new TreeNode965(2);
        TreeNode965 node3 = new TreeNode965(13);
        node1.left = node2;
        node1.right = node3;
        TreeNode965 root = convertBST(node1);
        print(root);
    }

    private static TreeNode965 convertBST(TreeNode965 root) {
        int sum = 0;
        if(root!=null){
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }

    private static void print(TreeNode965 root) {
        if(root!=null){
           System.out.println(root.val);
           print(root.left);
           print(root.right);
        }
    }
}
