package problem3;
import java.lang.Override;

public class Novel extends Book{
    public double price;
    public Novel(String title, String author, int nbrPages, double price){
        super(title, author, nbrPages);
        this.price=price;
    }
    @Override
    public String toString(){
        String str=super.toString();
        return str+String.format(" The price: %f",this.price);
    }
}
