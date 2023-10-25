public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        if(n == 0) return null;
        if(n == 1)
            return new TreeNode(nums[0]);
        else if(n == 2) {
            TreeNode root = new TreeNode(nums[1]);
            root.left = new TreeNode(nums[0]);
            return root;
        }
        else {
            int mid = n/2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
            root.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid+1, n));
            return root;
        }
    }
}
