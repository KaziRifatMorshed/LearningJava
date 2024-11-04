package IO;

import java.io.*;

public class OutputTheFile implements Serializable {

    public static void main(String[] args) {
//        Serializer serializer = new Serializer(); // eta ki jinis ?
        try {
            FileOutputStream fout = new FileOutputStream("IO/Alpha.meaw");
//            ObjectOutputStream o_out = new ObjectOutputStream(fout);
            PrintWriter o_out = new PrintWriter(fout);
//            o_out.writeObject("Pakhi ki paka pepe khay ???");
            o_out.write("Pakhi ki paka pepe khay ???");
            o_out.close();
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
