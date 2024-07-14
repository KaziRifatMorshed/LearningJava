package DataStracture;

class bstNode {
    public int data;
    public bstNode left, right;

    public bstNode(int data, bstNode left, bstNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public bstNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public bstNode getLeft() {
        return left;
    }

    public void setLeft(bstNode left) {
        this.left = left;
    }

    public bstNode getRight() {
        return right;
    }

    public void setRight(bstNode right) {
        this.right = right;
    }
}

class BinarySearchTree {

    bstNode Insert_Node(bstNode p, int data) {

        if (p == null) { // MAIN and CAREFULLY think
            p = new bstNode(data);
            return p;
        }

        if (p.data < data) {
            p.right = Insert_Node(p.right, data);
        } else {
            p.left = Insert_Node(p.left, data);
        }
        return p;
    } // should work

    void Print_All_LEAF_Nodes(bstNode p) {
        if (p == null) {
            return;
        }
        if (p.left == null && p.right == null) {
            System.out.print(STR."\{p.data} ");
            return;
        }

        if (p.left != null)
            Print_All_LEAF_Nodes(p.left);

        if (p.right != null)
            Print_All_LEAF_Nodes(p.right);
    } // should work


    // -----------------------------------------------------

    // ==================== Main Method ====================
    static void main(String[] args) {

    }

}
