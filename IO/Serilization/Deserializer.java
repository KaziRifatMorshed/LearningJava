package IO.Serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializer {
    public static void main(String[] args) {
        User inputted_user = null; // Declare the object

        try {
            FileInputStream file2 = new FileInputStream("./IO/Serilization/One.ser");
            ObjectInputStream ois = new ObjectInputStream(file2);
            inputted_user = (User) ois.readObject();
            System.out.println(STR."Username was \{inputted_user.name} and pass was \{inputted_user.password}");
            inputted_user.sayHello();

            System.out.println("Done");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
} // DONE
