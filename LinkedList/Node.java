package LinkedList;

public class Node {
    public int value = 10;
    Node next = null;
    Node(int value){
        this.value = value;
    }

    public static void Print(Node val){
        Node temp = val;
        int count = 0;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
            if (count == 10){
                break;
            }
            count++;
        }
    }

    public static void main(String []args){
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = a;
        Print(a);
    }
}
