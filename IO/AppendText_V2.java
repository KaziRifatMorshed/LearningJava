package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class AppendText_V2 {


    public static void main(String[] args) {
        String file_path = "/home/noobcodermsi/Documents/GitHub/LearningJava/IO/learningiojava2.txt";

        Scanner scanner = new Scanner(System.in);
        PrintWriter output_stream = null;

        System.out.println(STR."Opening file: \{file_path}...");
        try {
            output_stream = new PrintWriter(new FileOutputStream(file_path, true));
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            System.out.println(STR."Error opening file... \{e.getMessage()}");
            System.exit(-999);
        }

        System.out.println("We are going to append the existing file.\ninput 3 lines: ");
        for (int i = 0; i < 3; i++) {
            String temp = scanner.nextLine();
            output_stream.println(temp);
        }

        output_stream.close();
        System.out.println("Work done");
    }

}
