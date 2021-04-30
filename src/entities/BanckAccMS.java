package entities;

public class BanckAccMS {

        private int accountNumber;
        private String name;
        private double initialDeposit;
        private double deposit;
        private double bankBalance;
        private double withdraw;

        private final double BANK_TAX = 5.00;

        public BanckAccMS(int accountNumber, String name, double initialDeposit, double deposit, double bankBalance, double withdraw) {
            this.accountNumber = accountNumber;
            this.name = name;
            this.initialDeposit = initialDeposit;
            this.deposit = deposit;
            this.bankBalance = bankBalance;
            this.withdraw = withdraw;
        }
        public BanckAccMS(int accountNumber, String name) {
            this.accountNumber = accountNumber;
            this.name = name;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public String getName() {
            return name;
        }

        public String setName() {
            return name;
        }
        public double depositInit(char resp) {
            return initialDeposit = 0.00;
        }

        public double balance(double initialDeposit) {
            return bankBalance =  this.initialDeposit + initialDeposit;
        }

        public double deposits(double deposit) {
            return bankBalance += this.deposit + deposit;
        }

        public double balance() {
            return bankBalance = initialDeposit + deposit;
        }
        public double withdraw(double withdraw) {
            return bankBalance = bankBalance - BANK_TAX - withdraw;
        }

        public  String toString() {
            return
                    "Account: "
                            + accountNumber
                            + ", Holder: "
                            + name
                            + ", "
                            + String.format("Balance: %.2f %n", bankBalance);


        }


    }
