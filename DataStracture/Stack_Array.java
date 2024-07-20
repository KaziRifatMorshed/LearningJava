package DataStracture;

class Stack_Array {
    int data;

    public Stack_Array(int data) {
        this.data = data;
    }

    void Push_to_Stack_Array(Stack_Array[] s, int new_data, int t, int max) {
        if (t < max) {
            s[t++].data = new_data;
        } else {
            System.out.println("Stack Overflow \";(\"");
        }
    }

    void Pop_from_Stack_Array(Stack_Array[] s, int t, int max) {

    }

    void Print_Whole_Stack(Stack_Array[] s, int t) {
        System.out.print("Printing Stack from TOP to BOTTOM: ");
        for (; t != 0; t--) {
            System.out.print(STR."\{s[t].data} ");
        }
        System.out.println();
    }


}

/*
class test {
    static void main(String[] args) {
// =========================================================================
// ----------------------- Creating Stack -----------------------------
// =========================================================================
        int max = 20;
        Stack_Array[] my_Stack = new Stack_Array[max];
        int top = 0;

// =========================================================================
// -------------------- Push to Stack --------------------
// =========================================================================
        for (int i = 0; i < 20; i = i + 3) {
            if (top < max) {
                my_Stack[top++] = new Stack_Array(i);
            } else {
                System.out.println("Stack Overflow \";(\"");
                break;
            }
        }
//        Printing Stack from TOP to BOTTOM: 18 15 12 9 6 3 0

// ==============================================================================
// ------------------- Pop from Stack -------------------
// ==============================================================================
        for (int i = 0; i < 2; i++) {
            if (top == 0) {
                System.out.println("Stack is Empty !!!");
                break;
            } else {
                my_Stack[top] = null;
                top--;
            }
        }
//        Printing Stack from TOP to BOTTOM: 12 9 6 3 0

// ====================================================================================
// ----------------------- Print stack -----------------------
// ====================================================================================
        System.out.print("Printing Stack from TOP to BOTTOM: ");
        for (int t = top - 1; t >= 0; t--) { // REMINDER:  int t = top - 1
            System.out.print(STR."\{my_Stack[t].data} ");
        }

    } // WORKING PERFECTLY
}  // test class is WORKING PERFECTLY
* */