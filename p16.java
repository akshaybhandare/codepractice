
// find diameter 
public class p16 {
    static int diameter = 0;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
        height(root);
        System.out.println(diameter);
        
    }

    public static int height(TreeNode root){
        if(root ==null ) return 0;

       int lh = height(root.left);
       int rh =  height(root.right);

       diameter = Math.max(diameter , lh+ rh);

       return 1+ Math.max(lh, rh);
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
}
