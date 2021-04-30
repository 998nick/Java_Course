package application;
import entities.RentingProgram;
import java.util.Locale;
import java.util.Scanner;

public class Renting {


        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            RentingProgram[] vect = new RentingProgram[10];

            System.out.print("How many rooms will be rented? ");
            int n = sc.nextInt();


            for(int i = 1; i<=n; i++) {
                System.out.println();
                System.out.println("RENT #" + i + ": ");
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                System.out.print("Room: ");
                int room = sc.nextInt();
                vect[room] = new RentingProgram(name, email);

            }

            System.out.println();
            System.out.println("Busy rooms: ");
            for(int i = 0; i <10; i++) {
                if(vect[i] != null) {
                    System.out.println(i + ": " + vect[i]);
                }
            }


            sc.close();
        }
    }
