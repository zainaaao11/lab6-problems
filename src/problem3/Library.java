package problem3;
import java.lang.Override;
public class Library {
    private int capacity;
    public Library(int capacity){
        this.capacity=capacity;
    }
    @Override
    public String toString(){
        return String.format("The Library's capacity is: %d", this.capacity);
    }


}
