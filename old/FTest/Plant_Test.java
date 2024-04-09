package FTest;
public class Plant_Test {
  
  public static void main(String[] args){
  Plant[] garden = new Plant[3];
  garden[0] = new Plant("Vine");
  garden[1] = new Lotus("Vanity");
  Lotus l = new Lotus("Pride", 2048);
  l.smellOn();
  garden[2] = l;

  for (Plant p: garden){
   System.out.println(p); 
  }
  System.out.println("There are " + Plant.getNumPlants()
    + " plants.");

  Lotus r = new Lotus("Loathing");
  System.out.println(r.getName());
  System.out.println("There are " + Lotus.getNumLotuses()
    + " Lotus plants.");
  Plant p =new Plant("Rose");
  Rosemary r1 = new Rosemary("Rose");
  System.out.println("There are " + Plant.getNumPlants()
    + " plants.");
  System.out.println("There are " + Rosemary.getNumRosemaries()
    + " Rosemary plants.");  

 }
  
}
