package Exercises;
import java.util.Scanner;

public class ExerciseFor4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i<n; i++) {
            double a = sc.nextInt();
            double b = sc.nextInt();

            if ( b == 0) {
                System.out.println("Divisao impossivel");
            } else {
                double c = a / b;
                System.out.println(c);
            }

        }
        sc.close();
    }
}
