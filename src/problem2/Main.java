package problem2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("My Bank");
        Customer alice = new Customer("Alice", new ArrayList<>());
        Customer bob = new Customer("Bob", new ArrayList<>());
        bank.addCustomer(alice);
        bank.addCustomer(bob);
        // Try adding Alice again
        bank.addCustomer(new Customer("Alice", new ArrayList<>()));
        // Alice's transactions
        bank.addTransactionToCustomer(alice, 100.0);
        bank.addTransactionToCustomer(alice, -25.50);
        bank.addTransactionToCustomer(alice, 40.0);
        // Bob's transactions
        bank.addTransactionToCustomer(bob, -30.0);
        bank.addTransactionToCustomer(bob, 10.0);
        bank.custumorInfos(alice);
        bank.custumorInfos(bob);
    }
}