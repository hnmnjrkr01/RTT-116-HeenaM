package M303_13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {

        File file = new File("src/temp.txt");

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));         //append ",true" -->to write next to the existing material in the file

            bw.write("Hello World");
            bw.newLine();
            bw.write("----------------------\n");
            bw.write("line 11\n");  
            bw.write("----------------------\n");
            bw.write("line 12\n");
            bw.write("----------------------\n");
            bw.write("line 13\n");
            bw.write("----------------------\n");
            bw.append("line 14\n");
            bw.write("----------------------\n");

            bw.flush();                                             //we are writing into the Buffer & that's writing it to file fo flush() force it to write all the stuff to file
                                                                    //so it highly RECOMONDED to flush() the buffer before closing
            bw.close();                                             //close() also need Exception Handling

        }catch (IOException e) {
            e.printStackTrace();                                                //we were just unsuccessful
        }

    }
}
