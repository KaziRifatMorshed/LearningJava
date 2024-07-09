package DataStracture;

class Node {
    private int value;
    private Node next = null;

    public Node(int v) {
        this.value = v;
    }

    public Node(int v, Node n) {
        this.value = v;
        this.next = n;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

class LinkedList {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
