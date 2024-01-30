package Lab1_HW_Dice_Die;


import java.util.Random;
import java.util.Scanner;

public class Dice_OOP_V1 {
    static Random rand = new Random();

    public static void main(String[] args) {
        Scanner meaw = new Scanner(System.in);
        System.out.print("Input the number of sides of the two dices and Maximum nember of throws: ");
        int side1 = meaw.nextInt();
        int side2 = meaw.nextInt();
        int numThrow = meaw.nextInt();
        System.out.println(STR."Number of snake eyes :\{SnakeEeyGame(side1, side2, numThrow)}");
    }


    static int SnakeEeyGame(int side1, int side2, int t) {
        int count = 0;
        Dice dicee1 = new Dice();
        Dice dicee2 = new Dice();
        for (int i = 0; i < t; i++) {
            dicee1.roll();
            dicee2.roll();
            if (dicee1.getFaceValue() == 1 && dicee2.getFaceValue() == 2) {
                count++;
            }
        }
        return count;
    }
}
//public void main() {
//}



/*
import java.util.*;

// public class Die_2_Test {
public class Dice_OOP_V1 {

    static Random rand = new Random();


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number of sides of the two dices and Maximum nember of throws: ");
        int side1 = scan.nextInt();
        int side2 = scan.nextInt();
        int numThrow = scan.nextInt();
        System.out.println(STR."Number of snake eyes :\{numSnakeEyes(side1, side2, numThrow)}");
    }

    static int numSnakeEyes(int sides1, int sides2, int numThrows) {
        Dice die1 = new Dice(sides1);
        Dice die2 = new Dice(sides2);

        int count = 0;
        for(int i = 0; i < numThrows; i++) {
            die1.roll();
            die2.roll();
            if (die1.getFaceValue() == 1 && die2.getFaceValue() == 1 )
                count++;
        }

        return count;
    }

}
*/