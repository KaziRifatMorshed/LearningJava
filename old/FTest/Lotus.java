package FTest;
public class Lotus extends Plant implements Smell {

 private int numLeaves;
 private boolean smell;

 private static int numCreated = 0;

 public Lotus(String name) {
  super("Lotus:" + name );
  numLeaves = 1024;
  smell = false;
  numCreated++;
 }

 public Lotus(String name, int numLeaves) {
  super("Lotus:" + name );
  this.numLeaves= numLeaves;
  smell = false;
  numCreated++;
 }

 public String getName(){
  return super.getName() + " has " + numLeaves+" leaves ";
 }

 public static int getNumLotuses(){
  return numCreated;
 }
 
 public void smellOn(){
   smell = true;
 } 
 public void smellOff(){
   smell = false;
 }
 public String toString(){
   String S;
   if(smell)
     S=" and it is spreading smell";
   else
     S=" and it is not spreading smell";
   return this.getName()+S;
 }

}