package problem3;
import java.lang.Override;

public class Magazine extends Document{
    private String month;
    private int year;
    public Magazine(String title, String month, int year){
        super(title);
        this.month=month;
        this.year=year;
    }
    @Override
    public String toString(){
        String str=super.toString();
        return str+String.format(" The Magazine's release month : %s\nThe Magazine's release year : %d", this.month,this.year);
    }
}
