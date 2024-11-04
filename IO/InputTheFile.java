package IO;

import java.io.*;

public class InputTheFile implements Serializable {

    public static void main(String[] args) {
        String save_me = null;

        try {
            FileReader fin = new FileReader("/mnt/GitHub/LearningJava/IO/Alpha.meaw");
            BufferedReader ois = new BufferedReader(fin);
//            ObjectInputStream ois = new ObjectInputStream(fin);
            save_me = ois.readLine(); // default is STRING
//            save_me = (String) ois.readObject();
            System.out.println(save_me);
            ois.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        catch (ClassNotFoundException e) {
//            // java: exception java.lang.ClassNotFoundException is never thrown in body of corresponding try statement
//            throw new RuntimeException(e);
//        }

    }
}
