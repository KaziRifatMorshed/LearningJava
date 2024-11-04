package quadratic;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Quadratic {
    public static void main(String []args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("input a: ");
        a = scan.nextInt();
        System.out.println("input b: ");
        b = scan.nextInt();
        System.out.println("input c: ");
        c = scan.nextInt();

        double d = (b * b - 4 * a * c);
        double root1 = (((-b)+Math.sqrt(d))/(2*a));
        double root2 = (((-b)-Math.sqrt(d))/(2*a));

        String formatted_root1 = String.format("%.3f", root1);
        String formatted_root2 = String.format("%.3f", root2);

        // Life Savoir
        DecimalFormat meaw = new DecimalFormat("0.###");

        System.out.println(STR."Root 1 is \{root1} and root2 is \{root2}\nAnd, after formatting:\n\{formatted_root1} and \{formatted_root2}");
        System.out.println(STR."Again, root1 = \{meaw.format(root1)} and root2 = \{meaw.format(root2)}");
        // 3 8 4
    }
} // DONE
