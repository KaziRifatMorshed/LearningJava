package IO;

import java.io.*;

public class ReadFromFile {
    public static void main(String[] args) {
        String file_path = "/home/noobcodermsi/Documents/GitHub/LearningClang/A_Football.cpp";
        BufferedReader reader1 = null;
        String lines = null;

        try {

            reader1 = new BufferedReader(new FileReader(file_path));
            lines = reader1.readLine();

            while (lines != null) {
                System.out.println(lines);
                lines = reader1.readLine();
            }
            reader1.close();

        } catch (FileNotFoundException e) {
            System.out.println(STR."File not found...\{e.getMessage()}");
            throw new RuntimeException(e);
//            System.exit(0);
        } catch (IOException e) {
            System.out.println("IO Error");
            throw new RuntimeException(e);
        }
    }
}
