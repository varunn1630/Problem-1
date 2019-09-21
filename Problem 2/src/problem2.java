//Name: Varun Chaudhari
//UCF ID: 4831096
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter user's height in feet? ");
        double feet = console.nextInt();
        System.out.print("Enter user's height in inches? ");
        double height = console.nextDouble();
        height = feet*12 + height;
        System.out.print("Enter user's weight in pounds? ");
        double weight = console.nextDouble();
        //    System.out.println("Integer :" + n);
        //    System.out.println("Double :" + db);
        //      System.out.print(" Enter user weight In Pound : ");
        //       Scanner weight = new Scanner( System.in );
        //        System.out.print(" Enter user height In feet: ");
        //
        //           Scanner height = new Scanner( System.in );

        double bmi = (weight * 703 / height / height);

        //        System.out.println("Encrypted Value :"+encval);
        System.out.printf("BMI = %.1f\n",bmi);
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal");
        } else if (bmi < 30) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }
    }
}
