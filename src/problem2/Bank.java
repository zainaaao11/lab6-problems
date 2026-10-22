package problem2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers=new ArrayList<>();
    public Bank(String name){
        this.name=name;
    }
    public void addCustomer(Customer customer){
        boolean flag=false; // we will suppose that the customer doesn't exist already
        for (Customer c: this.customers){
            if (c.getName().equalsIgnoreCase(customer.getName())){
                flag=true;
                break;
            }
        }
        if (!(flag)) this.customers.add(customer);
    }
    public void addTransactionToCustomer(Customer customer,Double transcation){
        for (Customer c: this.customers){
            if (c.getName().equalsIgnoreCase(customer.getName())){
                c.addTransaction(transcation);
                break;
            }
        }
    }
    public void custumorInfos(Customer customer){
        double transactionAmount=0;
        ArrayList<Double> transactions=new ArrayList<>();
        for (Customer c: this.customers){
            if (c.getName().equalsIgnoreCase(customer.getName())) {
               transactions=c.getTransactions();
               break;
            }
        }
        if (!(transactions.isEmpty())){
            for (Double d: transactions){
                transactionAmount+=d;
            }
        }
        System.out.printf("Customer's name: %s\nTransactions total amount: %.2f\n", customer.getName(), transactionAmount);
    }

}
