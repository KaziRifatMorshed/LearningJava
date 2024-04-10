package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class NameNumberReader {

    public static void main(String[] args) {
        try {
            Scanner target = new Scanner(new File("./IO/NameNumber.txt"));
            String temp1;
            int temp2;
            double temp3;
            while (target.hasNext()) { // target.hasNext()
                temp1 = target.next(); // target.next()
                temp2 = target.nextInt();
                temp3 = target.nextDouble();
                System.out.println(STR."<\{temp3}, \{temp2}, \{temp1}>");
            }
            target.close();
        }
//        catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Error reading in.txt");
            System.exit(-1);
        }
//        catch (FileNotFoundException e) { // java: exception java.io.FileNotFoundException has already been caught
//            System.out.println(e.getMessage());
//            System.out.println("in.txt not found");
//            System.exit(-1);
//        }

    }

} // DONE
