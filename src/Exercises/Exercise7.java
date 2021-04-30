package Exercises;
import java.util.Locale;
import java.util.Scanner;

public class Exercise7 {

        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            double a, b, c, triangle, trapeze, square, rectangle, radius, radiusF;
            double pi = 3.14159;

            a = sc. nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            triangle = a * c / 2;
            radius = Math.pow(c, 2.0);
            radiusF = pi * radius;
            trapeze =  (a + b) * c / 2;
            square = Math.pow(b, 2.0);
            rectangle = a * b;

            System.out.printf("Triangulo: %.3f%n", triangle);
            System.out.printf("Circulo: %.3f%n", radiusF);
            System.out.printf("Trapezio: %.3f%n", trapeze);
            System.out.printf("Quadrado: %.3f%n", square);
            System.out.printf("Retangulo: %.3f%n", rectangle);


            sc.close();
        }
    }

