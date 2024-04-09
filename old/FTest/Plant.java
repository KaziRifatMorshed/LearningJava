package FTest;
public class Plant {

 private String name;
 private static int numCreated = 0;
 
 public Plant(String name){
  this.name = name;
  numCreated++;
 }

 public String getName(){
  return name;
 }
 
 public static int getNumPlants(){
  return numCreated;
 }
 
 public String toString(){
   return this.name+" is a plant";
 }
}