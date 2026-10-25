package problem3;
import java.lang.Override;

public class Textbook extends Book{
    public String level;
    public Textbook(String title, String author, int nbrPages, String level){
        super(title, author, nbrPages);
        this.level=level;
    }
    @Override
    public String toString(){
        String str=super.toString();
        return str+String.format(" The level: %s",this.level);
    }


}
