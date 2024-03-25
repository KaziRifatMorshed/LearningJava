package Speaker;

public class Dog implements Speaker{
    protected String name;

    public Dog(String n){
        name = n;
    }

    @Override
    public void speak(){
        System.out.println(STR."a dog \{name} is baring");
    }

    @Override
    public String toString(){
        return STR."Doggy\{name} barks, Ghew Ghew";
    }
} // DONE