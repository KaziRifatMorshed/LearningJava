package DataStracture;

import static DataStracture.Node.*;

class Node {
    private int value;
    private Node next = null;

    Node(int v) {
        this.value = v;
    }

    @Override
    public String toString() {
        return STR."Node{value=\{value}, next=\{next}\{'}'}";
    }

//    public Node(int v, Node n) { // THIS IS A BAD IDEA COZ WE DON.T KNOW WHO WILL BE NEXT in future

    int getValue() {
        return value;
    }

    void setValue(int value) {
        this.value = value;
    }

    Node getNext() {
        return next;
    }

    void setNext(Node next) {
        this.next = next;
    }

    static void PrintWholeLinkedList(Node p) {
//        while (p.next != null) { // p.next হবে না । কারণ লুপের লাস্টে ইঙ্ক্রিমেন্ট করে নেক্সট কে ভ্যারিএবলে নিয়ে নেওয়ার আমাকে লুপ-স্টার্টিং কন্ডিশন চেকিং এ p.next চেক করা লাগবে না, p নাল কি না চেক করলেই হবে ।
        System.out.print("Printing Whole Linked List: ");
        while (p != null) {
            System.out.print(STR."\{p.value} ");
            p = p.next;
        }
        System.out.println();
    } // DONE

    static void PrintWholeLinkedListREVERSELY(Node p) {
        if (p == null) {
            return;
        }
        PrintWholeLinkedListREVERSELY(p.next);
        System.out.println(p.value);
    } // DONE

    // নিচের এটা পসিবল কি না ভবিষ্যতে ট্রাই করে দেখব
//    public static void REVERSE_a_Linked_List(Node p) { // Self Try
//        if (p == null || p.next == null) {
//            return;
//        }
//        REVERSE_a_Linked_List(p.next.next); // ???
//        (p.next).next = p.next;
//        // নতুন হেড হারিয়ে ফেলেছি
//    }

    static Node REVERSE_a_Linked_List(Node p) { // কম কম বুঝেছি
        if (p == null || p.next == null) {
//            return null; // না, নাল রিটার্ন করলে লাস্ট নোড কে হারিয়ে ফেললাম
            return p;
        }
        Node q = REVERSE_a_Linked_List(p.next); // ???
        (p.next).next = (p.next); // পরবর্তী নোডের এর নেক্সট এ নিজেকে রাখবে
        (p.next) = null; // পরবর্তী এর নেক্সটে নিজেকে রেখে নিজের ভবিষ্যতকে নাল করে দিবে
        return q;
    }

    static Node SortedMergeLinkedList(Node A, Node B) {
        // difficult
        // BASE CASE
        // রিকার্সিভ কল করে যাকে পাস করেছি তাকে চেক করব বেইস কেস এ
        if (A == null) {
            return B;
        }
        if (B == null) {
            return A;
        }
        // Mechanism
        if (A.value < B.value) { // A ছোট
            // যে ছোট তাকে ধরে তার নেক্সট কে খুজব
            A.next = SortedMergeLinkedList(A.next, B);
            return A;
        } else {
            B.next = SortedMergeLinkedList(A, B.next);
            return B;
        }
    } // WORKING

    static void Sort_Singly_Linked_List(Node head) {
        Node p = head;
        while (p != null) {
            Node f = p.next;
            while (f != null) {
                if (p.value > f.value) {
//                    { // changing value only
//                        int temp = p.value;
//                        p.value = f.value;
//                        f.value = temp;
//                    } // WORKING
                    { // changing nodes

                    }
                }
                f = f.next;
            }
            p = p.next;
        }
    }
}

class LinkedList {
    static void main(String[] args) {
        // Linked List Creation
        Node head1 = null;
        Node head2 = null;
        Node p = null;
        for (int i = 1; i <= 10; i++, i++) {
//            System.out.print(STR."Loop's i = \{i}, ");
            if (i == 1) {
                p = head1 = new Node(i);
            } else {
                Node new_node = new Node(i);
                p.setNext(new_node);
                p = new_node;
            }
        }
        for (int i = 1; i <= 10; i++, i++) {
//            System.out.print(STR."Loop's i = \{i}, ");
            int randInt = (int) (Math.random() * 100);
            if (i == 1) {
                p = head2 = new Node(randInt);
            } else {
                Node new_node = new Node(randInt);
                p.setNext(new_node);
                p = new_node;
            }
        }
//----------------------------------------------------------
// ============ Print Whole List ============
//        PrintWholeLinkedList(head2); // DONE
//----------------------------------------------------------
// ============ Print whole list Reversely ============
//        PrintWholeLinkedListREVERSELY(head); // DONE
//----------------------------------------------------------
// ============ Reversed Link List Printing ============
//        Node k = REVERSE_a_Linked_List(head);
//        PrintWholeLinkedList(k);
//        PrintWholeLinkedList(head);
        // DONE
//----------------------------------------------------------
// ============= Shorted Merged Linked List ==============
//        SortedMergeLinkedList(head1, head2);
//        PrintWholeLinkedList(head1);
//        PrintWholeLinkedList(head2);
        // DONE
///---------------------------------------------------------
// ============= Insert a node ==============
///---------------------------------------------------------
// ============= delete a node ==============
///---------------------------------------------------------
// ============= Sort a singly linked list ==============
        Sort_Singly_Linked_List(head2);
        PrintWholeLinkedList(head2);

///---------------------------------------------------------


    }
}
