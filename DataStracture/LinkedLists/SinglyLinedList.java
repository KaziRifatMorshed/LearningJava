package DataStracture.LinkedLists;

class E {
    int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public E(int e) {
        data = e;
    }

    public String toString() {
        return STR."data = \{this.data}";
    }
}

class SinglyLinedList<E> {
    public static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element) {
            this.element = element;
        }

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private Node<E> head, tail;
    protected int size;

    SinglyLinedList() {
    }

    Node<E> getHead() {
        return head;
    }

    void setHead(Node<E> head) {
        this.head = head;
    }

    Node<E> getTail() {
        return tail;
    }

    void setTail(Node<E> tail) {
        this.tail = tail;
    }

    int getSize() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void setSize(int size) {
        this.size = size;
    }

    Node<E> getFirst() {
        if (isEmpty()) return null;
        return head;
    }

    Node<E> getLast() {
        if (isEmpty()) return null;
        return tail;
    }

    void addFirst(E e) {
        Node<E> new_node = new Node<>(e);
        new_node.next = head;
        head = new_node;
        size++;
    }

}
