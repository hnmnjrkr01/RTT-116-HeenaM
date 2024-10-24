package coffee_shop;

import java.text.DecimalFormat;
import java.util.*;

public class CoffeeShop2 {

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

        Product p5 = new Product("Ginger Cookie",5.89,0);
        products.add(p5);


        //adding more products from file using
        List<Product> loadedProducts = new ProductLoader().laodProduct();
        products.addAll(loadedProducts);
    }

    private List<Product> sortListByPrice(List<Product> products) {
        for(int countI = 0; countI < products.size()-1; countI++){
            for(int countJ = 0; countJ < products.size()-1; countJ++){
                if(products.get(countJ).getPrice() > products.get(countJ+1).getPrice()){
                    Product temp=  products.get(countJ);
                    products.set(countJ, products.get(countJ+1));
                    products.set(countJ+1, temp);
                }
            }
        }
        return products;
}

    private void printProductMenu(List<Product> productMenu){
        sortListByPrice(productMenu);

        String pattern = "$###.##";
        DecimalFormat nf = new DecimalFormat(pattern);

        for(int count = 0; count < productMenu.size(); count++){
              Product product = productMenu.get(count);
              System.out.println((count +1)+ ") " +product.getName()+ " \t" +nf.format(product.getPrice())); //count+1 will do the math & increment the value properly
          }
  }
  private int printMainMenu(){

        System.out.println("\n1) See Product Menu");
        System.out.println("2) Purchase Product");
        System.out.println("3) Checkout");
        System.out.println("4) Search Product");
        System.out.println("5) Exit");
      if ( cart.size() > 0 ) {
          // equivlant of front end code .. meaning we changed the user input to deny the unser an option when
          // they have no products in their cart
          System.out.println("6) Remove Item From Cart");
      }

          try {
            return readNumberFromUser("\nEnter selection: ");
        }catch (InvalidInputException iie) {iie.getMessage();}

        return 0;
    }

    public void productSearch() throws InvalidInputException {
        System.out.println("Enter a product name ");
        String search = scanner.nextLine();

        if (search.equalsIgnoreCase("coffee") ||
                search.equalsIgnoreCase("cookie") ||
                search.equalsIgnoreCase("small") ||
                search.equalsIgnoreCase("large")) {

            List<Product> resultList = products.stream().filter(
                    p -> p.getName().toLowerCase().
                            contains(search.toLowerCase())).toList();
            resultList.forEach(System.out::println);

        } else {
            throw new InvalidInputException("Invalid input "+search);
        }
    }


  private int readNumberFromUser(String question) throws InvalidInputException{
        System.out.print(question);
        try {
               int selection = scanner.nextInt();
               return selection;                    //finally will still be called after RETURN stmt.
        }catch (InputMismatchException e){
            //this is throwing Checked Exception
            throw new InvalidInputException("Invalid Input: You must enter a valid number.");
        }finally {
            scanner.nextLine();
        }
    }



    public void addProductToCart(){
        //display items
        printProductMenu(products);

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

    private void deleteProductFromCart(){
        printProductMenu(cart);
        try {

            int selection = readNumberFromUser("Enter product number to delete");

            // do some error checking here on both of these
            int quantity = readNumberFromUser("Enter quantity to remove:");

            // lets assume the user only enters valid data
            Product remove = cart.get(selection-1);

            if ( remove.getQuantity() < quantity ) {
                // this is the case where there are 5 in the cart and we want to remove 3
                remove.setQuantity(remove.getQuantity() - quantity);
            } else {
                // this remove the item from the cart
                cart.remove(selection - 1);
             }
        }catch (InvalidInputException iie) {
            System.out.println("===========Cart is EMPTY=================");
        }
    }

   public void checkout(){
        //show cart item
        System.out.println("========Items in your cart :==============");

        double subtotal = 0.0;

        String pattern = "\t\t\t\t$###.##";
        DecimalFormat nf = new DecimalFormat(pattern);

        for(Product item: cart){
            double totalPriceForEachProduct = item.getPrice() * item.getQuantity();
            System.out.println(item.getName()+"\t"+
                               nf.format(item.getPrice())+
                               "\t X "+
                               item.getQuantity() + " = "+
                               nf.format(totalPriceForEachProduct));
            subtotal += totalPriceForEachProduct;
        }
        System.out.println("\n");
        System.out.println("Subtotal\t\t"+ nf.format(subtotal));
            //cal tax
        double tax = subtotal * 0.09;
        System.out.println("Tax\t\t\t\t"+nf.format(tax));
        //cal total

        double total = subtotal + tax;
        System.out.println("Total\t\t\t"+nf.format(total));
    }

  public void start(){
        //similar to main method where our project starts and runs

        initProducts();

        while(true) {
            int selection = printMainMenu();

            if (selection == 1) {
                printProductMenu(products);
            } else if (selection == 2) {
                addProductToCart();
            } else if (selection == 3) {
                checkout();
            }else if (selection == 4) {
                try {
                    productSearch();
            }catch (InvalidInputException iie) {
                    System.out.println(iie.getMessage()+" No results were found ");}
            }
            else if (selection == 5) {
                System.out.print("Goodbye!");
                System.exit(0);
            } else if (selection == 6 && (cart.size()>0)) {
                    deleteProductFromCart();
            } else {
                System.out.println("Invalid selection "+ selection);
            }

        }

   }

    public static void main(String[] args) {
         CoffeeShop2 cs =new CoffeeShop2();
         cs.start();


    }
}
