package Interface.Guitar;


public class ElectricGuitar extends StringedInstrument {
    public ElectricGuitar() {
        name = "গিটার";
        num_of_string = 6;
    }

    public ElectricGuitar(int numberOfStrings) {
        name = "Guitar";
        num_of_string = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println(STR."An electric \{num_of_string}-string \{name} is rocking!");
    }
}
