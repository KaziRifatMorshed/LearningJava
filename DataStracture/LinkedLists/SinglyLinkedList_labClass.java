package DataStracture.LinkedLists;

public class SinglyLinkedList_labClass {
    private static class data_SLL {
        private int data;

        public data_SLL(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return STR."\{this.data}";
        }
    }

    private static class Node_SLL {
        private data_SLL data;
        private Node_SLL next;

        public Node_SLL(data_SLL data, Node_SLL next) {
            this.data = data;
            this.next = next;
        }

        public Node_SLL(data_SLL data) {
            this.data = data;
        }

        public data_SLL getData() {
            return data;
        }

        public void setData(data_SLL data) {
            this.data = data;
        }

        public Node_SLL getNext() {
            return next;
        }

        public void setNext(Node_SLL next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return STR."\{data} ";
        }
    }

    private Node_SLL head;
    private int size;

    SinglyLinkedList_labClass() {
        head = null;
        this.size = 0;
    }

    SinglyLinkedList_labClass(Node_SLL head) {
        this.head = head;
        this.size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    void addFirst(data_SLL d) {
        if (head == null) { // nothing in the list
            head = new Node_SLL(d, null);
        } else {
            Node_SLL new_node = new Node_SLL(d, head);
            head = new_node;
        }
        size++;
    }

    Node_SLL getLast() {
        if (head == null) {
            return null; // ------------------------------------------------ I missed this
        }
        Node_SLL current = head;
//        while (current != null || current.next != null) {
        while (current.next != null) {
            current = current.next;
        }
        return current;
    } // completed

    Node_SLL removeLast() {
        if (!isEmpty()) {
            Node_SLL current = head, previous = head;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
            size--; // this function is to get last element, not to remove last one
            return current;
        }
        return null;
    } // completed


////////////// my buggy code ///////////////////
//    void addLast(data_SLL d) {
//        Node_SLL last_node = getLast();
////        System.out.println(STR."add last 119 \{last_node == null}");
//        Node_SLL new_node = new Node_SLL(d, null);
//        last_node.setNext(new_node);


    void addLast(data_SLL d) {
        Node_SLL new_node = new Node_SLL(d, null);
        if (head == null) {
            head = new_node;
        } else {
            Node_SLL last_node = getLast();
            last_node.next = new_node;
        }
        size++;
    } // completed

    void printList() {
        if (head == null) {
            return;
        }
        Node_SLL temp = head;
        while (temp != null) {
            System.out.print(temp);
            temp = temp.next; // ------------------------- sadly i missed this too
        }
        System.out.println();
    } // completed

    ///////////////////////////////////////////////////////////////////////////
    // -------------------------- PROBLEM SOLVING -------------------------- //
    ///////////////////////////////////////////////////////////////////////////

    /* Question:
    You are given the heads of two 'sorted' singly linked lists list1 and list2.
    Merge the two lists into one sorted list.*/

    void sortedMerge(SinglyLinkedList_labClass list1, SinglyLinkedList_labClass list2) {
        int len1 = list1.getSize();
        int len2 = list2.getSize();

        Node_SLL e1 = list1.head;
        Node_SLL e2 = list2.head;

        for (int i = 1; i <= (len1 + len2); i++) {

            if (e1 == null) {
                while (e2 != null) {
                    addLast(e2.getData());
                    e2 = e2.getNext();
                }
                return;
            }
            if (e2 == null) {
                while (e1 != null) {
                    addLast(e1.getData());
                    e1 = e1.getNext();
                }
                return;
            }
            if (e1.getData().getData() == e2.getData().getData()) {
                addLast(e1.getData());
                e1 = e1.getNext();
                e2 = e2.getNext();
            }
            if (e1.getData().getData() < e2.getData().getData()) {
                addLast(e1.getData());
                e1 = e1.getNext();
            } else if (e1.getData().getData() > e2.getData().getData()) {
                addLast(e2.getData());
                e2 = e2.getNext();
            }
        }
    } // done


    /* Question:
    Given the head of a 'sorted' singly linked list,
    delete all duplicates such that each element appears only once.*/



    /* Question:
    You are given the head of a linked list.
    Remove every node which has a node with a greater value anywhere to the right side of it.
    * */

    ///////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        SinglyLinkedList_labClass list1 = new SinglyLinkedList_labClass();
        SinglyLinkedList_labClass list2 = new SinglyLinkedList_labClass();

        int[] arr1 = {9, 10, 20, 30, 40, 50};
        int[] arr2 = {1, 2, 3, 4, 5, 33};

        for (int i = 0; i < arr1.length; i++) {
            list1.addLast(new data_SLL(arr1[i]));
            list2.addLast(new data_SLL(arr2[i]));
        }

//        SinglyLinkedList_labClass sorted_list = new SinglyLinkedList_labClass();
//        sorted_list.sortedMerge(list1, list2);
//        sorted_list.printList();


    }
}
