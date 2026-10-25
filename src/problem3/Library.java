package problem3;
import javax.print.Doc;
import java.lang.Override;
import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> documents;
    public Library(int capacity){
        this.capacity=capacity;
        this.documents=new ArrayList<>(this.capacity);
    }
    @Override
    public String toString(){
        return String.format("The Library's capacity is: %d", this.capacity);
    }
    public void displayDocuments(){
        for (Document d: this.documents){
            if (d!=null){
                System.out.println(d.title);
            }
        }
    }
    public boolean add(Book doc){
        return this.documents.add(doc);
    }
    public boolean delete(Document doc){
        int elemIndx=-1;
        for (int i=0; i<this.documents.size(); i++){
            if (this.documents.get(i).title.equalsIgnoreCase(doc.title)){
                elemIndx=i;
            }
        }
        if (elemIndx==-1) {
            return false; //because the element wasn't found
        }
        return this.documents.remove(this.documents.get(elemIndx));
    }
    public Document document(int numEnrg){
        for (Document d: this.documents){
            if (d!=null && d.numRec==numEnrg){
                return d;
            }
        }
        return null; //because if we don't return inside the loop that means the document was not found
    }
    public void displayAuthors(){
        for (Book d: this.documents){
            if (d!=null){
                System.out.println("The Book: "+d.title+", The Author: "+d.author);
            }
        }
    }




}
