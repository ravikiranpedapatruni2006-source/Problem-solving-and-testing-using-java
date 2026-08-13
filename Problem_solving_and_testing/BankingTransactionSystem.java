import java.util.Scanner;

public class BankingTransactionSystem {

    static class BankAccount {
        int balance = 0;

        void deposit(int amount) {
            balance += amount;
        }

        void withdraw(int amount) {
            balance -= amount;
        }

        int getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        BankAccount account = new BankAccount();

        for (int i = 0; i < n; i++) {
            String operation = sc.nextLine();

            String[] parts = operation.split(" ");
            String type = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (type.equals("Deposit")) {
                account.deposit(amount);
            } else if (type.equals("Withdraw")) {
                account.withdraw(amount);
            }
        }

        System.out.println(account.getBalance());

        sc.close();
    }
}