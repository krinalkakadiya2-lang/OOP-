class BankAccount {
    String account_holder_name;
    double balance;
    static double interest_rate = 5.0;

  
    BankAccount(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }

    
    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

  
    void display() {
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interest_rate + "%");
        System.out.println("Interest Earned: " + calculateInterest());
        System.out.println();
    }

  
    static void updateInterestRate(double newRate) {
        interest_rate = newRate;
        System.out.println("Interest rate updated to: " + interest_rate + "%\n");
    }
}

public class Pr10 {
    public static void main(String[] args){
                          
        BankAccount acc1 = new BankAccount("Krinal", 10000);
        BankAccount acc2 = new BankAccount("Rahul", 20000);

        System.out.println("Before Updating Interest Rate:");
        acc1.display();
        acc2.display();

        // Updating interest rate using static metobjects      BankAccount.updateInterestRate(7.5);

        System.out.println("After Updating Interest Rate:");
        acc1.display();
        acc2.display();
    }
}

/*
Output:

Before Updating Interest Rate:
Account Holder: Krinal
Balance: 10000.0
Interest Rate: 5.0%
Interest Earned: 500.0

Account Holder: Rahul
Balance: 20000.0
Interest Rate: 5.0%
Interest Earned: 1000.0

Interest rate updated to: 7.5%

After Updating Interest Rate:
Account Holder: Krinal
Balance: 10000.0
Interest Rate: 7.5%
Interest Earned: 750.0

Account Holder: Rahul
Balance: 20000.0
Interest Rate: 7.5%
Interest Earned: 1500.0
*/
