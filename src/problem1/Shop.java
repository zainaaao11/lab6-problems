package problem1;
import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            scan.nextLine();
// *** create a new item and add it to the cart
            Item newItem=new Item(itemName, itemPrice, quantity);
            cart.add(newItem);
            // *** print the contents of the cart object using println
            //this is our first try on printing but isn't not good so we will replace it by a loop
            //System.out.println("The content of the shopping cart is: "+cart.toString());
            double totalPrice=0;
            for (Item i: cart){
                System.out.printf("item's name: %s, item's price: %.2f, item's quantity: %d\n", i.getName(), i.getPrice(), i.getQuantity());
                totalPrice+=i.getPrice()*i.getQuantity();
            }
            System.out.println("The total price: "+totalPrice);
            System.out.print("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
        }
        while (keepShopping.equals("y"));
    }
}
