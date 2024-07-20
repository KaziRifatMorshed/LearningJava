package DataStracture;

class Stack_LinkedList {
    int data;
    Stack_LinkedList next;

    Stack_LinkedList(int data, Stack_LinkedList next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return STR."\{data} ";
    }



    public static void main(String[] args) {

    }
}

