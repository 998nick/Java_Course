package Exercises;
import java.util.Scanner;

public class ExerciseFor5 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int x = 1;

            for (int i = 1; i<=n; i++) {
                x = x * i;
            }

            System.out.println(x);

            sc.close();
        }
    }


