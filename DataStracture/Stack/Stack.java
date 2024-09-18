package DataStracture.Stack;

class Stack_SLL {
    private static class data_Stack {
        private int data;

        public data_Stack(int data) {
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
    } // copied from SLL

    private static class Node_Stack {
        private data_Stack data;
        private Node_Stack next;

        public Node_Stack(data_Stack data, Node_Stack next) {
            this.data = data;
            this.next = next;
        }

        public Node_Stack(data_Stack data) {
            this.data = data;
        }

        public data_Stack getDataObj() {
            return data;
        }

        public void setData(data_Stack data) {
            this.data = data;
        }

        public Node_Stack getNext() {
            return next;
        }

        public void setNext(Node_Stack next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return STR."\{data} ";
        }
    } // copied from SLL

    private Node_Stack head;
    private int size;

    Stack_SLL() {
        head = null;
        this.size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    Node_Stack pop() { // copied from SLL
        if (!isEmpty()) {
            Node_Stack temp = head;
            if (size == 1) {
                head = null;
            } else {
                head = head.getNext();
                temp.setNext(null);
            }
            size--;
            System.out.println(STR."data \{temp.getDataObj().getData()} has been popped");
            return temp;
        }
        return null;
    }

    Node_Stack getLast() { // copied from SLL
        if (head == null) {
            return null; // ------------------------------------------------ I missed this
        }
        Node_Stack current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    } // completed

    void push(data_Stack d) { // copied from SLL
        Node_Stack new_node = new Node_Stack(d, null);
        if (head == null) {
            head = new_node;
        } else {
            Node_Stack last_node = getLast();
            last_node.next = new_node;
        }
        size++;
        System.out.println(STR."data \{d.getData()} has been pushed to stack");
    } // completed

    boolean printStack() {
        if (isEmpty()) {
            return false;
        } else {
            System.out.print("Printing stack : ( ");
            for (Node_Stack i = head; i != null; i = i.getNext()) {
                System.out.print(i);
            }
            System.out.println(")");
            return true;
        }
    }

    public static void main(String[] args) {
        Stack_SLL list2 = new Stack_SLL();
        int[] arr2 = {1, 2, 3, 4, 5, 33};

        for (int i = 0; i < arr2.length; i++) {
            list2.push(new data_Stack(arr2[i]));
        }

        list2.printStack();

        list2.pop();

        list2.printStack();


    }
}


class Stack_Array {
    private static class data_Stack {
        private int data;

        public data_Stack(int data) {
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
    } // copied from SLL

    private static class Node_Stack {
        private data_Stack data;
        private Node_Stack next;

        public Node_Stack(data_Stack data, Node_Stack next) {
            this.data = data;
            this.next = next;
        }

        public Node_Stack(data_Stack data) {
            this.data = data;
        }

        public data_Stack getDataObj() {
            return data;
        }

        public void setData(data_Stack data) {
            this.data = data;
        }

        public Node_Stack getNext() {
            return next;
        }

        public void setNext(Node_Stack next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return STR."\{data} ";
        }
    } // copied from SLL

    private Node_Stack[] stacks;
    private int limit_of_stack = 0;
    private int size;

    Stack_Array(int limit_of_stack) {
        this.limit_of_stack = limit_of_stack;
        stacks = new Node_Stack[this.limit_of_stack];
        this.size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    Node_Stack pop() { // copied from SLL
        if (!isEmpty()) {
            Node_Stack temp = head;
            if (size == 1) {
                head = null;
            } else {
                head = head.getNext();
                temp.setNext(null);
            }
            size--;
            System.out.println(STR."data \{temp.getDataObj().getData()} has been popped");
            return temp;
        }
        return null;
    }

    Node_Stack getLast() { // copied from SLL
        if (head == null) {
            return null; // ------------------------------------------------ I missed this
        }
        Node_Stack current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    } // completed

    void push(data_Stack d) { // copied from SLL
        Node_Stack new_node = new Node_Stack(d, null);
        if (head == null) {
            head = new_node;
        } else {
            Node_Stack last_node = getLast();
            last_node.next = new_node;
        }
        size++;
        System.out.println(STR."data \{d.getData()} has been pushed to stack");
    } // completed

    boolean printStack() {
        if (isEmpty()) {
            return false;
        } else {
            System.out.print("Printing stack : ( ");
            for (Node_Stack i = head; i != null; i = i.getNext()) {
                System.out.print(i);
            }
            System.out.println(")");
            return true;
        }
    }

    public static void main(String[] args) {
        Stack_Array list2 = new Stack_Array();
        int[] arr2 = {1, 2, 3, 4, 5, 33};

        for (int i = 0; i < arr2.length; i++) {
            list2.push(new data_Stack(arr2[i]));
        }

        list2.printStack();

        list2.pop();

        list2.printStack();


    }
}


class Stack_DLL {

}
