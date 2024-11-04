package NumericalMethods;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.Math.abs;

// NOT Object Oriented

class NewtonRaphson {
    static String equation;
    static float a, b, c, d, x_n, x_prev;
    static float E = 0.0005f;
    static int n;
    static Scanner scanner = new Scanner(System.in);
    // 0x^3 + 1x^2 - 3x + 2
    // x = 1

    static float f(float num) {
        return ((a * num * num * num) + (b * num * num) + (c * num) + d);
    }

    static float f_(float num) {
        return ((3 * a * num * num) + (2 * b * num) + c);
    }

    static void getEquation() {
        equation = scanner.nextLine();
        Scanner eq = new Scanner(equation);

//        if (Pattern.matches("*x^3", equation))
        a = eq.nextInt();
        b = eq.nextInt();
        c = eq.nextInt();
        d = eq.nextInt();

        System.out.println(STR."\{a} \{b} \{c} \{d}");
    }

    static void getIteration() {
        System.out.println("Input Iteration number : ");
        n = scanner.nextInt();
    }


    public static void main(String[] args) {
        System.out.println("Evaluating the root of f(x) = ax^3 + bx^2 + cx + d in Newton-Raphson Method");
        System.out.println("Input Equation : ");
        getEquation();
        getIteration();

        for (int i = 1; i <= n; i++, x_prev = x_n) {
            x_n = (x_prev - (f(x_prev) / f_(x_prev)));

            System.out.println("Iteration : " + i + "\tx_n : " + x_n);

            if ((abs(x_n - x_prev) / x_n) < E) {
                System.out.println("Root Found.\nRoot is " + x_n);
                break;
            }
        }
        System.out.println("\nProgram Completed");
    }

}
