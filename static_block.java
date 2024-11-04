class static_block {
}

class T {
    public static void main(String[] args) {
        AB ab1 = new AB();
        AB ab2 = new AB();
        AB ab3 = new AB();
    }
}

class AB {
    static int a = 5;

    static { // মাত্র একবারই এক্সিকিউট হবে
        System.out.println("Execution of static block");
    }
}
/*
Execution of static block

Process finished with exit code 0
 */