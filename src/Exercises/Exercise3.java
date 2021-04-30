package Exercises;
import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {

        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            double pi = 3.14159;
            double area;
            area = sc.nextDouble();
            double raio = Math.pow(area, 2.0);
            double formulaArea = pi * raio;

            System.out.printf("A= %.4f", formulaArea);

            sc.close();
        }
    }
// valor do raio de um circulo