package Lab1_HW_Dice_Die;
import java.util.*;
public class Dice_OOP_V2 {

    static Random randy = new Random();

    public static void main(String[] args){
        Dice dice11, dice22;
        dice11 = new Dice(7,7);
        dice22 = new Dice(43,43);

        dice11.roll();
        dice22.roll();
        System.out.println(dice11);
        System.out.println(dice22);
        dice11.roll();
        dice22.roll();
        System.out.println(dice11);
        System.out.println(dice22);
        dice11.roll();
        dice22.roll();
        System.out.println(dice11);
        System.out.println(dice22);



    }

}
