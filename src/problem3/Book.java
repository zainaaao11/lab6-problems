package problem3;
import java.lang.Override;

public class Book extends Document{
    protected String author;
    protected int nbrPages;
    public Book(String title, String author, int nbrPages){
        super(title);
        this.author=author;
        this.nbrPages=nbrPages;
    }
    @Override
    public String toString(){
        String str=super.toString();
        return str+String.format("The Book's author : %s\nThe Book's pages number : %d", this.author,this.nbrPages);

    }

}
