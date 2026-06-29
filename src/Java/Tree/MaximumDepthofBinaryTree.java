package Tree;

public class MaximumDepthofBinaryTree {
    public class ListNode{
        int val;
        ListNode left;
        ListNode right;

        public ListNode(int val){
            this.val = val;
        }
        public ListNode(int val , ListNode left , ListNode right){
            this.val = val;
            this.left = left;
            this.right =  right;
        }
    }
    public int maxDepth(ListNode root){
        if (root == null) return 0;
        return 1+ Math.max(maxDepth(root.left) , maxDepth(root.right));
    }

    public static void main(String[] args) {
        MaximumDepthofBinaryTree obj = new MaximumDepthofBinaryTree();
        ListNode root = obj.new ListNode(1);
        root.left = obj.new ListNode(2);
        root.right = obj.new ListNode(3);

        root.left.left = obj.new ListNode(4);
        root.left.right = obj.new ListNode(5);

        root.left.left.left = obj.new ListNode(6);

        System.out.println("maxmimum height of the binary tree :- " + obj.maxDepth(root));
    }
}
