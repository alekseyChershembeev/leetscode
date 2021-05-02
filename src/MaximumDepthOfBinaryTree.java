/**
 * Author: Aleksey Chershembeev
 * created : 02.05.2021 - 19:32
 * description:
 */
public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {

        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.right = new TreeNode(4);
        node.right.right.right = new TreeNode(5);
        node.right.right.right.left = new TreeNode(7);

        System.out.println(depth(node));
    }


    public static int depth(TreeNode treeNode){

        if (treeNode==null)return 0;


        int left = depth(treeNode.left);
        int right = depth(treeNode.right);

        return left>right?++left:++right;

    }







}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }


    @Override
    public String toString() {
        System.out.println(val);
        print(left);
        print(right);
        return "";
    }


    private void print(TreeNode treeNode) {

        if (treeNode == null) return ;
        System.out.println(treeNode.val);
        print(treeNode.left);
        print(treeNode.right);

    }
}
