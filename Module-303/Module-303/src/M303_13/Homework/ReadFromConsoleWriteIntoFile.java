package M303_13.Homework;


import java.util.Scanner;
import java.io.*;

public class ReadFromConsoleWriteIntoFile {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String location = "C:\\Users\\hnmnj\\development\\RTT-116CLASSWORK\\Module-303\\ReadFromConsoleWriteIntoFile.txt";
    File file = new File(location);
    PrintWriter writer = null;

    try{
    writer = new PrintWriter(file);
    System.out.println("Enter your Data");

    while(scanner.hasNextLine()){
        String line = scanner.nextLine();
        writer.println(line);
        writer.println("---------------------------");
        writer.flush();
    }

    }catch(FileNotFoundException fnfe){
        System.out.println(fnfe.getMessage()+" File NOt Found!!");
    }catch (Exception e){
        System.out.println(e.getMessage()+" Exception!!!!");
    }
    finally {
        writer.close();
    }

}
}
