package Lab_Test_4_2024;

public class Flower {
    protected int num_petal;
    protected String flower_name;

    public Flower(int n, String nam){
        num_petal = n;
        flower_name = nam;
    }
    public String toString(){
        return flower_name + "{" + num_petal + "}";
    }

    public void Compare(Object o){
        Flower f = (Flower) o;
        if (this.num_petal == f.num_petal){
            System.out.println(this.toString() + " has equal petals as " + f.toString());
        }
//        if (this.num_petal > f.num_petal){
//            System.out.println(this.toString() + " has more petals as " + f.toString());
//        }
        if (this.num_petal < f.num_petal){
            System.out.println(this.toString() + " has less petals than " + f.toString());
        }
    }
}
