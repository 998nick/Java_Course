package Exercises;
import java.util.Scanner;

public class Exercise4 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int A, B, C, D;

            A = sc.nextInt();
            B = sc.nextInt();
            C = sc.nextInt();
            D = sc.nextInt();

            int diferenca = A * B - C * D;
            System.out.println("Diferenca = " + diferenca);


            sc.close();
        }
    }
//le 4 valores inteiros e mostra o produto dos valores


