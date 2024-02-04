package Lab1;

public class Die {

  // private final int numFaces;  // maximum face value
  private int numFaces;  // maximum face value
  private int faceValue;  // current value showing on the die


  // Constructor: Sets the default face value.
  public Die()  {
    numFaces = 6;
    roll();
  }

  //  Constructor: Sets the initial face value.
  public Die(int _numFaces)  {
    numFaces = _numFaces;
    roll();
  }

  //  Constructor: Sets the initial face value.
  public Die(int _numFaces, int _faceValue)  {
    numFaces = _numFaces;
    faceValue = _faceValue;
    //roll();
  }



  //  Rolls the die
  public void roll() {
    faceValue = (int)(Math.random() * numFaces) + 1;
  }


  //  Face value setter/mutator.
  public void setFaceValue (int value)  { // I forgot it
    if (value <= numFaces){ // Good practice, condition checking
        faceValue = value;
    }
  }

  //  Face value getter/accessor.
  public int getFaceValue() {
    return faceValue;
  }
  
  //  Face value getter/accessor.
  public int getNumFaces() {
    return numFaces;
  }
  
  //  Returns a string representation of this die.
  public String toString() {
    return STR."number of Faces: \{numFaces} & current face value: \{faceValue}"; // String template
 }
}
