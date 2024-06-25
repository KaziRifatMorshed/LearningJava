package TelegramBot;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class demoFirst {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("~/tbtKU.txt"));
        String text = scanner.nextLine();
        System.out.println(text);
    }
}
