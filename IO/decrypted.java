package IO;

import java.io.*;

public class decrypted implements Serializable {

    public static void main(String[] args) {
        String save_me = null;

        try {

            FileInputStream fin = new FileInputStream("/home/noobcodermsi/Documents/GitHub/LearningJava/IO/Alpha.meaw");
            ObjectInputStream ois = new ObjectInputStream(fin);
            save_me = (String) ois.readObject();
            System.out.println(save_me);
            ois.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
