package problem3;
import java.lang.Override;

public class Document {
    private int incremental=1;
    protected int numRec;
    protected String title;
    public Document(String title){
        this.numRec=incremental++;
        this.title=title;
    }
    @Override
    public String toString(){
        return String.format("The document's record number : %d\nThe Document's title : %s", this.numRec,this.title);
    }
}
