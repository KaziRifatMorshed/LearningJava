import javax.swing.*;

/*
public class idontknowjava {
        public static void main(String[] args) {
            System.out.print("believe me bro\n");
            System.out.println("I Don't know java");
            System.out.print("I like to call it vaja");
        }
    }
 */
// java তুমি এতো ব্যাকা ত্যাড়া কেন, এত্তো বেশি নাট বল্টু কেন লাগে
/*
/usr/lib/jvm/java-21-openjdk/bin/java -javaagent:/mnt/IDEs/idea-IU-232.9921.47/lib/idea_rt.jar=44609:/mnt/IDEs/idea-IU-232.9921.47/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /mnt/GitHub/LearningJava/out/production/LearningJava idontknowjava
believe me bro
I Don't know java
I like to call it vaja
Process finished with exit code 0
 */
public class Sample{ // it suggested me to rename the file
    public static void main(String[] args) {
        String str, str1, str2, str3, result = null, name;
        char gender;
        int num, num2;
        do
        {
            str = JOptionPane.showInputDialog("What is your name?");
            name = String.valueOf(str);
            str2 = JOptionPane.showInputDialog("Male or Female?");
            gender = String.valueOf(str2).charAt(0);
            if(gender=='f'||gender=='F')
            {
                str1 = JOptionPane.showInputDialog("Please enter your favorite number: ");
                num = Integer.parseInt(str1);
                result = "Wow! "+name+" has "+num+" BF! 🤐";

            }
            else if(gender=='m'||gender=='M')
            {
                str1 = JOptionPane.showInputDialog("Please enter your favorite number: ");
                num = Integer.parseInt(str1);
                result = "Wow! "+name+" has "+num+" GF! 🤐";
            }
            JOptionPane.showMessageDialog(null, result);
            num2 = JOptionPane.showConfirmDialog(null, "Change the number!");

        }
        while(num2==JOptionPane.YES_OPTION);

    }
}