package application;
import entities.Currency;
import java.util.Locale;
import java.util.Scanner;

public class QuotePrice {


        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);


            System.out.print("What is the dollar price? ");
            double price = sc.nextDouble();


            System.out.print("How many dollars will be bought? ");
            double dollar = sc.nextDouble();

            double finalValue = Currency.conversor(price, dollar);

            System.out.printf("Amount to be paid in reais =  %.2f", finalValue);


            sc.close();
        }

    }

