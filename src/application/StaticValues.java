package application;
import entities.CalculatorStaticV;
import java.util.Locale;
import java.util.Scanner;

public class StaticValues {

        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter radius: ");
            double radius = sc.nextDouble();

            double c = CalculatorStaticV.circumference(radius);

            double v = CalculatorStaticV.volume(radius);


            System.out.printf("Circumference: %.2f%n", c);
            System.out.printf("Volume: %.2f%n", v);
            System.out.printf("PI value: %.2f%n", CalculatorStaticV.PI);


            sc.close();

        }

    }

