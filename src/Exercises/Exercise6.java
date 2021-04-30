package Exercises;
import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {


        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int codePiece, numberPiece;
            double pricePiece;

            codePiece = sc.nextInt();
            numberPiece = sc.nextInt();
            pricePiece = sc.nextDouble();

            int codePiece2, numberPiece2;
            double pricePiece2;

            codePiece2 = sc.nextInt();
            numberPiece2 = sc.nextInt();
            pricePiece2 = sc.nextDouble();

            double sum = pricePiece + pricePiece2;

            System.out.printf("Valor a pagar: %.2f", sum);

            sc.close();

        }
   }

