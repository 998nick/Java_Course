package application;
import entities.Grades;
import java.util.Locale;
import java.util.Scanner;

public class CalcGrades {

        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            Grades grades = new Grades();

            String name = sc.nextLine();
            grades.firstGrade = sc.nextDouble();
            grades.secondGrade = sc.nextDouble();
            grades.thirdGrade = sc.nextDouble();

            System.out.println(grades);

            if (grades.finalGrade() > 60.00) {
                System.out.println("PASS");
            } else {
                System.out.println("FAILED");
                System.out.printf("MISSING %.2f POINTS%n", grades.pointsMissing());
            }

            sc.close();

        }
    }

