package Exercises;
import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {

        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int number, hours;
            double valueHour, salaryCalc;

            number = sc.nextInt();
            hours = sc.nextInt();
            valueHour = sc.nextDouble();

            salaryCalc = hours * valueHour;

            System.out.println("Number: " + number);
            System.out.printf("Salary: U$ %.2f", salaryCalc);


            sc.close();
        }
    }
//calcula o valor do salario baseado nas horas trabalhadas

