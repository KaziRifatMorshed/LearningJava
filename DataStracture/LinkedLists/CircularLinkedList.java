package DataStracture.LinkedLists;

class CircularLinkedList<E> { // remember to <E>
    public static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E data) {
            this.element = data;
        }

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        E getElement() {
            return element;
        }

        void setElement(E element) {
            this.element = element;
        }

        Node<E> getNext() {
            return next;
        }

        void setNext(Node<E> next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return STR."node data = \{element}";
        }

    }

    //    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    boolean isEmpty() {
        return size == 0;
    }

    E getFirst() {
        if (isEmpty()) {
            return null;
        }
        return tail.getNext().getElement();
    }

    E getLast() {
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    void rotate() {
        if (!isEmpty()) {
            tail = tail.next;
        }
    }

    void addFirst(E e) {
        if (isEmpty()) {
            tail = new Node<>(e, null);
            tail.next = tail;
        } else {
            Node<E> new_node = new Node<E>(e, tail.next); // CAREFUL
            tail.next = new_node; // ----------------------------------------- REMINDER
        }
        size++; // REMINDER
    }

    void addLast(E e) {
        addFirst(e);
        tail = tail.next;
    }

    E removeFirst() {
        if (isEmpty() || size == 1) {
            return null;
        } else {
            E to_be_returned = tail.next.getElement();
            tail.next = tail.next.next;
            size--;
            return to_be_returned;
        }
    }

}
