package IO.Serilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializer {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "Rahim";
        user1.password = "karim";
        user1.sayHello();

        try {
            FileOutputStream file1 = new FileOutputStream("./IO/Serilization/One.ser");
            ObjectOutputStream oos = new ObjectOutputStream(file1);

            oos.writeObject(user1);
            oos.close();
            file1.close();
            System.out.println("DONE");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
} // DONE
