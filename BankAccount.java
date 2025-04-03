import java.util.Scanner;

public class BankAccount {

    int number;
    String name;
    double balance;

    void show() {
        System.out.println("Account Number: " + number);
        System.out.println("Account Holder's Name: " + name);
        System.out.println("Balance: $" + balance);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Account Details: ");
        System.out.println("----------");

        BankAccount BA = new BankAccount();
        BA.number = 10001;
        BA.name = "Ahmed";
        BA.balance = 9000;
        BA.show();
        

        BankAccount BA2 = new BankAccount();
        BA2.number = 10002;
        BA2.name = "Mohummad";
        BA2.balance = 9000;
        BA2.show();

        BankAccount BA3 = new BankAccount();
        BA3.number = 10002;
        BA3.name = "Ali";
        BA3.balance = 6000;
        BA3.show();

        
        System.out.print("Enter amount to credit to account1: ");
        BA.balance = scan.nextDouble();
        System.out.println("Updated Account Details");
        System.out.println("---------------");

        BA.show();
    }
}