import java.util.Stack;

/**
 * @author:Aurevoir
 * @date: 2019/11/23  15:58
 *
 * 给定 pushed 和 popped 两个序列，每个序列中的 值都不重复，
 * 只有当它们可能是在最初空栈上进行的推入 push 和弹出 pop 操作序列的结果时，
 * 返回 true；否则，返回 false 
 */
public class N946 {
    public static void main(String[] args) {
        int[] pushed = new int[]{1,2,3,4,5};
        int[] popped = new int[]{4,5,3,2,1};

        System.out.println(validateStackSequences(pushed,popped));
    }

    private static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int length = pushed.length;

        int i,j = 0;
        for(i = 0;i < length;i++){
            stack.push(pushed[i]);
            while(j<length&&!stack.isEmpty()&&stack.peek() == popped[j]){
                stack.pop();
                j++;
            }
        }
        return j==length;
    }
}
