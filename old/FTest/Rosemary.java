package FTest;
public class Rosemary extends Plant {

 private int numLeaves;

 private static int numCreated = 0;

 public Rosemary(String name) {
  super("Rosemary:" + name );
  numLeaves = 1024;
  numCreated++;
 }

 public Rosemary(String name, int numLeaves) {
  super("Rosemary:" + name );
  this.numLeaves= numLeaves;
  numCreated++;
 }

 public String getName(){
  return super.getName() + " numLeaves=" + numLeaves;
 }

 public static int getNumRosemaries(){
  return numCreated;
 }


}