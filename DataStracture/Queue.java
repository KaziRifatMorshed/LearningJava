package DataStracture;

public class Queue {
    private int size = -1;
    private int occupied = 0;
    private int[] queue_array;

    private Queue(int size) {
        this.size = size;
        queue_array = new int[size];
    }

    private boolean isEmpty() {
        return occupied == 0;
    }

    private boolean isFull() {
        return occupied == size;
    }

    private void enQueue (int new_data) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {

        }
    }

    private void print_whole_queue(){
        for (int i = 0 ; i < occupied; i++){
            System.out.print(STR."\{queue_array[i]} ");
        }
    }

}
