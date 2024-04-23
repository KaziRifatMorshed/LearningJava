package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFile {

    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("./IO/fun.txt");
        Scanner inFile = new Scanner(file1);
//        int number;
//        while (inFile.hasNextInt()) {
//            number = inFile.nextInt();
//            System.out.println(number);
//            // er por string thakle theme jasse
//        }
//        while (inFile.hasNextLine()) {
        while (inFile.hasNext()) {
            String s = inFile.nextLine();
            System.out.println(s);
            // er por string thakle theme jasse
        }
    }
}
