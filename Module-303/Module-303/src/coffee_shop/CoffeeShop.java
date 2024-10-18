package coffee_shop;

import java.text.DecimalFormat;
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

  }

    private int printMainMenu(){

        System.out.println("\n1) See Product Menu");
        System.out.println("2) Purchase Product");
        System.out.println("3) Checkout");
        System.out.println("4) Exit");

        try {
            return readNumberFromUser("\nEnter selection: ");
        }catch (InvalidInputException iie) {iie.getMessage();}

        return 0;

        }

    private int readNumberFromUser(String question) throws InvalidInputException{
        System.out.print(question);
        try {
               int selection = scanner.nextInt();
               return selection;                    //finally will still be called after RETURN stmt.
        }catch (InputMismatchException e){
            //this is throwing Checked Exception
            throw new InvalidInputException("Invalid Input: You must enter a valid number."+e.getMessage());
        }finally {
            scanner.nextLine();
        }
    }



    public void addProductToCart(){
        //display items
        printProductMenu();

        int quantity=0, selection=0;

        try {
            //take order
            try {
                while (true) {
                    System.out.println("\n");
                    selection = readNumberFromUser("Enter your selection");
                    if (selection >= 1 && selection < products.size()) {
                        quantity = readNumberFromUser("Enter quantity ");
                        break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Quantity");
            }

            //Error Check
            if (isProductSelectionValid(selection)) {
                //q.setQuantity(q.getQuantity + quantity); check the item in cart if its there the just increase the quantity
                /*
                 * when adding an item to the cart ... first increment the quantity
                 *  on the product by the amount that the person wanted to order ...
                 * then loop over the list of items in the cart and if the item is not
                 * in the cart then you add to the cart --- Amazon cart item quantity
                 * check if the product already exist in the cart
                 */
                //add product to cart

                Product p = products.get(selection - 1);
                //quantity
                /*
                 * if(!existInCart(p){
                 * cart.add(p);
                 * }*/
                if (cart.contains(p)) {

                    //adjustment to quantity on product
                    int index = cart.indexOf(p); //get the index of ordered product if it already exist in the cart
                    cart.get(index).setQuantity(cart.get(index).getQuantity() + quantity); //Fetch the product that already exist from the cart  //increase the quantity of the product by the new entered quantity

                } else {
                    p.setQuantity(quantity); //if the product is ordered first time, then just set the quantity
                    cart.add(p);
                }

                System.out.println(p.getName() + " added to the cart ");
            } else {
                System.out.println("Invalid item selection");
            }
        }catch (InvalidInputException iie) {iie.getMessage();}

    }

    private boolean isProductSelectionValid(int selectedProduct) {
        if(selectedProduct>=1 && selectedProduct<=products.size()) {
            return true;
        }
        return false;

    }

    private boolean existInCart(Product purchased){

        boolean found = false;
        for(Product item : cart) {
            if(item.getName().equals(purchased.getName())) {
                found = true;
                break;
            }
        }
        return found;
    }

    public void checkout(){
        //show cart item
        System.out.println("========Items in your cart :==============");

        double subtotal = 0.0;

        String pattern = "###.##";
        DecimalFormat nf = new DecimalFormat(pattern);

        for(Product item: cart){
            double totalPriceForEachProduct = item.getPrice() * item.getQuantity();
            System.out.println(item.getName()+"\t$"+
                               nf.format(item.getPrice())+
                               "\t X "+
                               item.getQuantity() + " = $"+
                               nf.format(totalPriceForEachProduct));
            subtotal += totalPriceForEachProduct;
        }
        System.out.println("\n");
        System.out.println("Subtotal\t\t$"+ nf.format(subtotal));
            //cal tax
        double tax = subtotal * 0.09;
        System.out.println("Tax\t\t\t\t$"+nf.format(tax));
        //cal total

        double total = subtotal + tax;
        System.out.println("Total\t\t\t$"+nf.format(total));
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
