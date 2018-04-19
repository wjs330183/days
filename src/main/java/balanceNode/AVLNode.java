package balanceNode;

public class AVLNode {
    public int data;
    public int balance;
    public int depath;
    public AVLNode parent;
    public AVLNode right;
    public AVLNode left;
    public AVLNode(int data) {
        this.data = data;
        balance = 0;
        depath = 0;
        left = null;
        right = null;
    }

    private void insert(AVLNode root, int data) {
        if (data < root.data) {
            if (root.left != null) {
                insert(root.left, data);
            } else {
                root.left = new AVLNode(data);
                root.left.parent = root;
            }
        } else {
            if (root.right != null) {
                insert(root.right, data);
            } else {
                root.right = new AVLNode(data);
                root.right.parent = root;
            }
        }
    }

}

