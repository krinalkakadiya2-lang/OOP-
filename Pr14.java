import java.util.Scanner;

class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(String accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
        System.out.println("Account opened successfully!");
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    double interestRate = 5.0; // 5%

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest: " + interest);
    }
}

class FixedDepositAccount extends BankAccount {
    double rate = 7.0; // 7%
    int years;

    void maturityAmount(int years) {
        this.years = years;
        double maturity = balance * Math.pow((1 + rate / 100), years);
        System.out.println("Maturity Amount after " + years + " years: " + maturity);
    }
}

public class Pr14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingAccount sa = new SavingAccount();
        sa.openAccount("101", "Krinal", 10000);
        sa.deposit(2000);
        sa.withdraw(1500);
        sa.checkBalance();
        sa.calculateInterest();

        System.out.println();

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount("102", "Raj", 50000);
        fd.maturityAmount(3);

        sc.close();
    }
}

/*
OUTPUT:

Account opened successfully!
Deposited: 2000.0
Withdrawn: 1500.0
Current Balance: 10500.0
Interest: 525.0

Account opened successfully!
Maturity Amount after 3 years: 61252.45
*/
