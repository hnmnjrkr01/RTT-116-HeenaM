package coffee_shop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ProductLoader {

    public List<Product> laodProduct(){
        List<Product> result = new ArrayList<>();
        String line;

       try { //Open the file to read from
           File file = new File("src/products.txt");


           BufferedReader reader = new BufferedReader(new FileReader(file));

           //read the file line by line
           while ((line = reader.readLine()) != null) {

               //Tokanize the line we just read
               String[] tokens = line.split(",");

               //Create a product and set the value to list object attributes
               Product product = new Product();

               product.setName(tokens[0]);
               product.setPrice(Double.parseDouble(tokens[1]));
               result.add(product);

               System.out.println(product);
           }










       }catch (Exception e){e.printStackTrace();}
        return result;
    }

    public static void main(String[] args) {
        new ProductLoader().laodProduct();
    }



}
