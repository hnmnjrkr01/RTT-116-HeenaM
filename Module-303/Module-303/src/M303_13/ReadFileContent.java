package M303_13;

import java.io.*;

public class ReadFileContent {
    public static void main(String[] args){

        File file = new File("src/temp.txt");

        try{
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str= "";


        while((str = br.readLine())!= null){
            System.out.println(str);
        }

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage()+" FileNotFoundException");
        }catch (IOException e){
            System.out.println(e.getMessage()+" IOException");
        }
    }
}
