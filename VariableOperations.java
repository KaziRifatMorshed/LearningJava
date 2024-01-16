public class VariableOperations {
    public static void main(String args[]){
        int a = 10, b = 13;
        int c = a + b;
        float cc = c;
        System.out.println(c);
        System.out.println(cc);
        // System.out.println("(float)a = ", (float)a, "(int)c = ", (int)cc ); // ERROR
        // System.out.println("(float)a = " + (float)a + ", (int)cc = " + (int)cc); // WORKS but BAD
        System.out.println(STR."(float)a = \{(float) a}, (int)cc = \{(int) cc}");

        int d = 130;
        byte e = (byte)d; // NEW DATA TYPE
        System.out.println(e); // STRANGE -126
        // but WHY ???

        byte alpha = 15;
        System.out.println(alpha);

        System.out.println();
        b = 10;
        System.out.println(a++ + b++);
        System.out.println(++a + b++);
        System.out.println(STR."now a = \{a} and b = \{b}");
    }
}