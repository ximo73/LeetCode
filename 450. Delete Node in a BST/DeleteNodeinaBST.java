public class DeleteNodeinaBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        int max;
        if(root == null) return root;
        if(key < root.val){
            root.left = deleteNode(root.left, key);
        }else if(key > root.val){
            root.right = deleteNode(root.right, key);
        }else{
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else{
                max = buscarMax(root.left);
                root.val = max;
                root.left = deleteNode(root.left, max);
            }
        }
        return root;
    }


    private int buscarMax(TreeNode root) {
        if(root.right == null) return root.val;
        return buscarMax(root.right);
    }

    public static void main(String[] args) {
        DeleteNodeinaBST sol = new DeleteNodeinaBST();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        System.out.println(sol.buscarMax(root.left));
    }
}
