package IO.Serilization;

import java.io.*;

public class Serializer {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "Rahim";
        user1.password = "karim";
        user1.sayHello();

        try {
            File f1 = new File("./IO/Serilization/One.ser");
            FileOutputStream file1 = new FileOutputStream(f1);
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
