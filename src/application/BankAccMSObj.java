package application;

import entities.BanckAccMS;

import java.util.Locale;
import java.util.Scanner;

public class BankAccMSObj {

        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter account holder: ");
            String name = sc.nextLine();

            System.out.print("Enter account number: ");
            int account= sc.nextInt();

            BanckAccMS bank = new BanckAccMS(account, name);
            bank.setName();

            System.out.print("Initial deposit (y/n)? ");
            char resp = sc.next().charAt(0);

            if(resp == 'n') {
                bank.depositInit(resp);
            } else {
                System.out.print("Enter initial deposit value: ");
                double initialDeposit = sc.nextDouble();
                bank.balance(initialDeposit);
            }
            System.out.println("Account data: ");
            System.out.print(bank);

            System.out.print("Enter deposit value: ");
            double deposit = sc.nextDouble();
            bank.deposits(deposit);

            System.out.println("Update account data: ");
            System.out.print(bank);

            System.out.print("Enter a withdraw value: ");
            double withdraw = sc.nextDouble();
            bank.withdraw(withdraw);

            System.out.print("Update account data: ");
            System.out.print(bank);
        }

    }

