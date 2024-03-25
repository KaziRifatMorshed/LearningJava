package Interface.Guitar;

public class ElectricBassGuitar extends StringedInstrument {
   public ElectricBassGuitar() {
         this.name = "Bass Guitar";
         this.num_of_string = 4;
     }
    public ElectricBassGuitar(int numberOfStrings) {
         this.name = "Bass Guitar";
         this.num_of_string = numberOfStrings;
    }
    public void play() {
         System.out.println(STR."An electric \{num_of_string}-string \{name} is rocking!");
    }
}
