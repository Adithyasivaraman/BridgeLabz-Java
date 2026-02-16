class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int v) { val = v; }
}

public class DiameterOfBinaryTree {

    static int diameter = 0;

    static int diameter(TreeNode root) {
        height(root);
        return diameter;
    }

    static int height(TreeNode node) {
        if (node == null) return 0;

        int left = height(node.left);
        int right = height(node.right);

        diameter = Math.max(diameter, left + right);

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {}
}
