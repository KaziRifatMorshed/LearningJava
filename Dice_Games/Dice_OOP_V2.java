package Dice_Games;
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

        int sum = 0;
        sum = dice11.getFaceValue() + dice22.getFaceValue();
        System.out.println(STR."SUM at first = \{sum}");
        dice11.roll();
        dice22.roll();
        sum = dice11.getFaceValue() + dice22.getFaceValue();
        System.out.println(STR."SUM after roll = \{sum}");
        dice11.roll();
        dice22.roll();
        sum = dice11.getFaceValue() + dice22.getFaceValue();
        System.out.println(STR."SUM after roll = \{sum}");
        dice11.roll();
        dice22.roll();
        sum = dice11.getFaceValue() + dice22.getFaceValue();
        System.out.println(STR."SUM after roll = \{sum}");


    }

}
