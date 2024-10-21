package M303_13;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerWriter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);                                            //character input stream System.in

        try {
            File file = new File("src/temp2.txt");
            PrintWriter pw = new PrintWriter(file);

            System.out.println("Enter a string to write in file:");

            String s = sc.nextLine();
            pw.write(s+"\n");
            pw.println(s);pw.append("12345");
            pw.flush();


        }catch (Exception e) {

        }

    }
}
