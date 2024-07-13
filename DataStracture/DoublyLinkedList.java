package DataStracture;

class dNode {
    int data;
    dNode next, prev;

    dNode(int n) {
        this.data = n;
    }

    dNode(int data, dNode prev, dNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    int getData() {
        return data;
    }
}

class DoublyLinkedList {

    static dNode Create_a_DoubleLinkedList(int n) {
        dNode head = null;
        dNode p = null;
        for (int i = 0; i < n; i += 2) {
            if (i == 0) {
                head = p = new dNode(i, null, null);
            } else {
//                dNode new_node = new dNode(i, p, null);
//                p.next = new_node;
//                p = p.next;
                p.next = new dNode(i, p, null);
                p = p.next;
            }
        }
        return head;
    } // WORKING

    static void PrintAllNodesOnce(dNode head) {
        dNode p = head;
        System.out.print("Printing All Nodes once: ");
        while (p != null) {
            System.out.print(STR."\{p.getData()} ");
            p = p.next;
        }
        System.out.println();
    } // WORKING

    static void PrintAllNodesBoomerang(dNode head) {
        dNode p = head;
        System.out.print("Printing All Nodes once and then reversely: ");
        while (p.next != null) {
            System.out.print(STR."\{p.getData()} ");
            p = p.next;
        }
        p = p.prev;
        while (p != null) {
            System.out.print(STR."\{p.getData()} ");
            p = p.prev;
        }
        System.out.println();
    } // WORKING


    static void main(String[] args) {
        dNode head = Create_a_DoubleLinkedList(20);
//        PrintAllNodesOnce(head);
        PrintAllNodesBoomerang(head);
    }
}
