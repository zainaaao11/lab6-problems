package problem2;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions=new ArrayList<>();
    public Customer(String name, ArrayList<Double> transactions){
        this.name=name;
        this.transactions=transactions;
    }
    public String getName(){
        return this.name;
    }
    public ArrayList<Double> getTransactions(){
        return this.transactions;
    }
    public void addTransaction(Double transaction){
        this.transactions.add(transaction);
    }

}
