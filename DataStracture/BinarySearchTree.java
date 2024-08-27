package DataStracture;

class bstNode {
    public int data;
    public bstNode left, right, parent;

    public bstNode(int data, bstNode left, bstNode right, bstNode parent) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }

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

    void PreOrder_Traversal() {
        System.out.println(STR." \{this.data} ");
        if (this.left != null) this.left.PreOrder_Traversal();
        if (this.right != null) this.right.PreOrder_Traversal();
    }

    void PostOrder_Traversal() {
        if (this.left != null) this.left.PostOrder_Traversal();
        if (this.right != null) this.right.PostOrder_Traversal();
        System.out.println(STR." \{this.data} ");
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

    static void insert_node(bstNode node, int d) {
        if (node == null) {
            return;
        }
        if (node.data == d) {
            System.out.println(STR."\{d}Already Exists !");
            return;
        }
    }

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

    static void InOrder_Traversal(bstNode n) {
        System.out.println("InOrder Traversal : [ ");
        inOrder_traverse(n);
        System.out.println("]");
    }

    static void inOrder_traverse(bstNode n) {
        if (n.left != null) inOrder_traverse(n.left);
        System.out.println(STR." \{n.data} ");
        if (n.right != null) inOrder_traverse(n.right);
    }


    private static bstNode search_bst(bstNode n, int key) {
        if (n != null) {
            if (n.data == key) {
                System.out.println(STR."Data \{key} has been FOUND !");
                return n;
            }
            if (key < n.data) {
                search_bst(n.left, key);
            } else {
                search_bst(n.right, key);
            }
        }
        System.out.println("Node not found ...");
        return null;
    }


    // -----------------------------------------------------

    // ==================== Main Method ====================
    static void main(String[] args) {

    }

}
