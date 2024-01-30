package Lab1_HW_Dice_Die;

import java.util.Random;
import java.util.Scanner;

public class Dice_SnakeGame {
    static Random rand = new Random(); // Why it was made STATIC ?

    public static void main(String[] args){
        Scanner meaw = new Scanner(System.in);
        System.out.println("input: num of sides of two dices and Maximum number of try/throw. (total 3 inputs having space between them)");
        int side1 = meaw.nextInt();
        int side2 = meaw.nextInt();
        int t = meaw.nextInt();
        // Now, Printing result
        System.out.println(STR."Number of Snake Eye cases: \{SnakeEyeGame(side1, side2, t)}");
    }

    static int roll(int num_of_sides){
        return 1 + rand.nextInt(num_of_sides);
    }
    static int SnakeEyeGame(int dice1_sides, int dice2_side, int num_of_throws){
        int count = 0;
         // if (roll(dice1_side) == 1 && roll(dice2_side) == 1){ // DOES NOT WORK
        int face1 = roll(dice1_sides);
        int face2 = roll(dice2_side);

        for (int i = 0; i < num_of_throws; i++){
            if (face1 == 1 && face2 == 1){
                count++;
            }
        }

        return count;
    }
}