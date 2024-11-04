package Die_Dice;
public class Die_4_Test {
    public static void main(String[] args){
        Die d1 = new Die(6,4);
        System.out.println("first: " + d1);
        // System.out.println("d1");

        Die d22 = new Die(8);
        System.out.println("second: " + d22);

        d22.roll();
        System.out.println("third(after rolling): " + d22);

        Die d33 = new Die();
        System.out.println("forth: " + d33);

    }
// idea
}