package Lab1;

public class Die {

  // instance variable:
  private int numFaces;  // maximum face value
  private int faceValue;  // current value showing on the die


  // Constructor: Sets the default face value.
  public Die()  { // constructor
    numFaces = 6;
    roll();
  }

  //  Constructor: Sets the initial face value.
  public Die(int _numFaces)  { // constructor
    numFaces = _numFaces;
    roll();
  }

  //  Constructor: Sets the initial face value.
  public Die(int _numFaces, int _faceValue)  { // constructor
    numFaces = _numFaces;
    faceValue = _faceValue;
    roll();
  }

  //  Rolls the die
  public void roll() {
    faceValue = (int)(Math.random() * numFaces) + 1;
  }

  //  Face value setter/mutator.
  public void setFaceValue (int value)  {
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
/*

  // IntelliJ API Decompiler stub source generated from a class file
  // Implementation of methods is not available

package java.lang;

public class Object {
    @jdk.internal.vm.annotation.IntrinsicCandidate
    public Object() { /* compiled code  }

@jdk.internal.vm.annotation.IntrinsicCandidate
public final native java.lang.Class<?> getClass();

@jdk.internal.vm.annotation.IntrinsicCandidate
public native int hashCode();

public boolean equals(java.lang.Object obj) { /* compiled code }

@jdk.internal.vm.annotation.IntrinsicCandidate
protected native java.lang.Object clone() throws java.lang.CloneNotSupportedException;

public java.lang.String toString() { /* compiled code  }

@jdk.internal.vm.annotation.IntrinsicCandidate
public final native void notify();

@jdk.internal.vm.annotation.IntrinsicCandidate
public final native void notifyAll();

public final void wait() throws java.lang.InterruptedException { /* compiled code  }

public final void wait(long timeoutMillis) throws java.lang.InterruptedException { /* compiled code  }

private final native void wait0(long l) throws java.lang.InterruptedException;

public final void wait(long timeoutMillis, int nanos) throws java.lang.InterruptedException { /* compiled code  }

  @deprecated

//@java.lang.Deprecated(since = "9", forRemoval = true)
//protected void finalize() throws java.lang.Throwable { /* compiled code  }
        }
 */