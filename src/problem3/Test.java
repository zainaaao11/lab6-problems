package problem3;
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of documents in the library: ");
        int n=scan.nextInt();
        Library library=new Library(n);
        Book book1=new Book("1984", "George Orwell", 328);
        Book book2=new Book("The prince", "Machiavelli", 164);
        library.add(book1);
        library.add(book2);
        int choice;
        do {
            System.out.println("Choose your operation from the following menu:");
            System.out.println("====Menu====");
            System.out.println("0: exit\n1: add\n2: delete\n3: display\n4: display authors");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    System.out.println("Enter the informations for the book to add(title, author, number of pages):");
                    String[] bookInfos = scan.nextLine().split(", ");
                    Book book = new Book(bookInfos[0], bookInfos[1], Integer.parseInt(bookInfos[2]));
                    library.add(book);
                    break;
                case 2:
                    System.out.println("Enter the title of document to delete:");
                    Document doc = new Document(scan.nextLine());
                    library.delete(doc);
                    break;
                case 3:
                    library.displayDocuments();
                    break;
                case 4:
                    library.displayAuthors();
                    break;
                default:
                    System.out.println("The choice is invalid");
            }
        }
        while(choice!=0);
    }
}
