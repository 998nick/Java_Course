package Exercises;
import java.util.Scanner;

public class Exercise2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int c;
            int v1, v2;

            System.out.println("Digite dois valores");

            v1 = sc.nextInt();
            sc.nextLine();
            v2 = sc.nextInt();
            sc.nextLine();
            c = v1 + v2;

            System.out.println("Soma = " + c);

            sc.close();
        }
    }
//soma dois numeros inteiros
