package Exceptions;

import java.util.*;

public class CourseCode {

    public static void main(String[] args) {
        int theory = 0, sessional = 0, invalid = 0;
        char last_digit;
        boolean isTheory = true;
        Scanner _scan = new Scanner(System.in);
        System.out.println("Enter Course Code (\"XXX\" to exit): ");
        String user_input = _scan.nextLine(); // _scan.nextLine()
        while (!user_input.equals("XXX")) {
            try {
                last_digit = user_input.charAt(7);
                isTheory = ((((int) (last_digit)) % 2) == 1);
                // System.out.println(((int) (last_digit))); // CONVERTING to ASCII
                if (isTheory) {
                    theory++;
                } else {
                    sessional++;
                }

            } catch (StringIndexOutOfBoundsException exception) {
                System.out.println(STR."Improper code length, you have inputted: \{user_input}");
            } catch (NumberFormatException exception) {
                System.out.println(STR."Last digit is not numeric, you have inputted: \{user_input}");
            } finally {
                System.out.println("Finally..."); // EXECUTES every time
            }

            System.out.println("Enter_course_Code (\"XXX\" to exit): ");
            user_input = _scan.nextLine();
        }
        System.out.println(STR."Number of valid theory courses entered: \{theory}");
        System.out.println(STR."Number of valid sessional courses entered: \{sessional}");
    }
}
