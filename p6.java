import java.util.LinkedList;
import java.util.Queue;

public class p6 {

    public static void main(String[] args) {
// [4,2,7,1,3,6,9]
       
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(7)));

     
        p6.printTree(   inverse(root));
        
    }

    private static p6.TreeNode inverse(p6.TreeNode root) {
        if(root == null) return null;
        
        p6.TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        inverse(root.left);
        inverse(root.right);

        return root;
    }

    public static class TreeNode {
        int val;
        TreeNode left, right;
        
        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
                    this.val = val;
                     this.left = left;
                     this.right = right;
                 }
    }

    public static void printTree(TreeNode root) {
    if (root == null) return;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        TreeNode node = queue.poll();
        System.out.print(node.val + " ");
        if (node.left != null) queue.add(node.left);
        if (node.right != null) queue.add(node.right);
    }
}
}
