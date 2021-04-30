package Exercises;
import java.util.Scanner;

public class ExerciseWhile1 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int password = sc.nextInt();

            while(password != 2020) {
                System.out.println("Senha invalida");
                password = sc.nextInt();
            }

            System.out.println("Acesso permitido");

            sc.close();


        }
    }

