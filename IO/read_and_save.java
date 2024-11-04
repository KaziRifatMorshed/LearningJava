package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class read_and_save {

    //    @lombok.SneakyThrows
    public static void main(String[] args) throws FileNotFoundException {
        String in_file_path, out_file_path, in_file_content = "";
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter input txt file name:");
//        in_file_path = keyboard.nextLine();
        in_file_path = "./iamdummy.txt";
        System.out.println("Enter output txt file name:");
//        out_file_path = keyboard.nextLine();
//        out_file_path = "HelloWorld.txt";
        out_file_path = "./HelloWorld.txt";

        File file_in = new File(in_file_path);
        File file_out = new File(out_file_path);

        Scanner f1 = new Scanner(file_in);
        while (f1.hasNext()) {
            in_file_content += f1.nextLine() + "\n";
        }
        System.out.println(STR."Content is :\{in_file_content}");

        FileOutputStream fos = new FileOutputStream(file_out, true);
        PrintWriter out_stream = new PrintWriter(fos);
        out_stream.write(in_file_content);
//        out_stream.println("hahahaha");
        out_stream.close(); // thanks SEAM for this help
    }
} // WORKING
