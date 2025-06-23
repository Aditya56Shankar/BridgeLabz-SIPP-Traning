import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String itemName=sc.nextLine();
        int total=0;
        int price=sc.nextInt();
        int quantity= sc.nextInt();
        CartItem cart=new CartItem(itemName,price,quantity,total);

        cart.addItem();
        cart.displayTotal();
        System.out.println("remove item");
        int p= sc.nextInt();
        int q=sc.nextInt();

        cart.removeItem(p,q);
        cart.displayTotal();




    }
}
class CartItem{
    private String itemName;
    private int price;
    private int quantity;
    private int total;


    public CartItem(String itemName, int price, int quantity,int total) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.total=total;
    }
    public int addItem() {

        total+=price*quantity;


        return total;
    }
    public int removeItem(int price,int quantity){

        total-=price*quantity;
        return total;
    }
    public void displayTotal(){

        System.out.println("total cost: "+total);
    }
}
