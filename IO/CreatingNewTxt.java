package IO;

import java.io.*;
import java.util.Scanner;

public class CreatingNewTxt {
    public static void main(String[] args) {
        PrintWriter output_stream = null;
        Scanner scanner = new Scanner(System.in);
        try {
            output_stream = new PrintWriter("IO/learningIOjava1.txt"); // CREATING NEW FILE
        } catch (FileNotFoundException e) {
            System.out.println(STR."Error opening the file,,,,\{e.getMessage()}");
            System.exit(0);
//            throw new RuntimeException(e);
        }

        System.out.println("Enter Three Lines of code: ");
        for (int i = 0; i < 3; i++) {
            String inputted_line = scanner.nextLine();
            output_stream.println(STR."<\{i}>.\{inputted_line}");
        }

        output_stream.close();
        System.out.println("...these lines has been written into the file");
    }

} // DONE
