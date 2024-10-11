package coffee_shop;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CoffeeShop {

    private List<Product> products = new ArrayList<Product>();
    private Scanner scanner = new Scanner(System.in);
    private List<Product> cart = new ArrayList<>();             //cart for coffee shop


    private void initProducts() {
        Product p1 = new Product("Small coffee",4.57,0);
        products.add(p1);

        Product p2 = new Product("Large coffee",7.99,0);
        products.add(p2);

        Product p3 = new Product("Sugar Cookie",5.89,0);
        products.add(p3);

        Product p4 = new Product("Egg Sandwich",6.49,0);
        products.add(p4);
  }

  private void printProductMenu(){

        for(int count = 0; count < products.size(); count++){
            Product product = products.get(count);
            System.out.println((count +1)+ ") " +product.getName()+ "\t " +product.getPrice()); //count+1 will do the math & increment the value properly
        }
        //System.out.println("\n");
  }

    private int printMainMenu(){

        System.out.println("\n1) See Product Menu");
        System.out.println("2) Purchase Product");
        System.out.println("3) Checkout");
        System.out.println("4) Exit");
        //System.out.println("\n");

        System.out.print("Enter selection: ");

        try {

            int select = scanner.nextInt();
            scanner.nextLine();
            System.out.println("\n");
            return select;
        }catch (InputMismatchException e){
            System.out.println("Invalid selection"+e.getMessage());
            return -1;
        }
        finally {
            //scanner.nextLine();
        }


    }

    public void addProductToCart(){
        //display item
        printProductMenu();

        //take order
        System.out.println("\n");
        System.out.print("Enter product number: ");
        int selection = scanner.nextInt();
        scanner.nextLine();

        //Error Check
        if(selection>1 || selection<=products.size()) {

            //add product to cart
            Product p = products.get(selection - 1);
            cart.add(p);
            System.out.println(p.getName() + " added to the cart ");
        } else{
            System.out.println("Invalid item selection");
        }

        //quantity
        //adjustment to quantity on product

    }

    public void checkout(){
        //show cart item
        System.out.print("========Items in your cart :==============");

        double subtotal = 0.0;

        for(Product item: cart){
            System.out.println("\n"+item.getName()+"\t"+item.getPrice()+"");
            subtotal += item.getPrice();
        }
        System.out.println("\n");
        System.out.println("Subtotal\t\t$"+subtotal);
            //cal tax
        double tax = subtotal * 0.09;
        System.out.println("Tax\t\t\t\t$"+tax);
        //cal total

        double total = subtotal + tax;
        System.out.println("Total\t\t\t$"+total);
    }

  public void start(){
        //similar to main method where our project starts and runs

        initProducts();

        while(true) {
            int selection = printMainMenu();

            if (selection == 1) {
                printProductMenu();
            } else if (selection == 2) {
                addProductToCart();
            } else if (selection == 3) {
                checkout();
            } else if (selection == 4) {
                System.out.print("Goodbye!");
                System.exit(0);
            } else {
                System.out.println("Invalid selection "+ selection);
            }

        }

   }

    public static void main(String[] args) {
         CoffeeShop cs =new CoffeeShop();
         cs.start();


    }
}
