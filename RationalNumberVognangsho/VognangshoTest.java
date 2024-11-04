package RationalNumberVognangsho;

public class VognangshoTest {
    public static void main(String[] args) {
        Vognangsho one = new Vognangsho(6, 8);
        Vognangsho two = new Vognangsho(1, 4);
        Vognangsho three = new Vognangsho(7);

        System.out.println(STR."First:\n\{one}\nSecond:\n\{two}\nand, Three:\n\{three}");

        Vognangsho four, five, six, seven, eight;

        if (one.isEqual(two)){
            System.out.println("one and two are equal.");
        } else {
            System.out.println("They are NOT equal");
        }

        four = three.inverse(); // careful SYNTAX
        five = one.add(two);
        //six
    }
}
