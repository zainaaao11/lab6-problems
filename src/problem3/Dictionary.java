package problem3;
import java.lang.Override;

public class Dictionary extends Document{
    private String language;
    public Dictionary(String title,String language){
        super(title);
        this.language=language;
    }
    @Override
    public String toString(){
        String str=super.toString();
        return str+String.format(" The Dictionary's language : %s\n", this.language);
    }
}
