// byKaziRifatMorshed230220
package Dice_Games;
import java.util.Random;
public class Dice {
    private int number_face;
    private int face_value;
    Random generator = new Random();

    public Dice(){
        number_face = 6;
    }
    public Dice(int num_face){
        number_face = num_face;
    } // current value default hisebe zero hao
    public Dice(int num_face, int current_face){
        number_face = num_face;
        face_value = current_face;
    }

    public void roll(){
        face_value = generator.nextInt(6) + 1;
    }


    public void setFaceValue(int newFaceValue){
        if(newFaceValue <= number_face){
            face_value = newFaceValue;
        }
    }

    public int getFaceValue(){
        return face_value;
    } // a function(method) to return this value \\      if (die1.getFaceValue() == 1 && die2.getFaceValue() == 1 )
    public int getNumFace(){ // কেন দরকার ? বুঝি নাই
        return number_face;
    }

    public String toString(){ // কেন দরকার ? বুঝি নাই
        return STR."number of faces=\{number_face} && current value=\{face_value}";
    }

    public String printString(){ // কেন দরকার ? বুঝি নাই
        return STR."number of faces=\{number_face} && current value=\{face_value}";
    }
// EOF
}
