package M303_13;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {


        //this can include ABSOLUTE or PARTIAL path

        File file = new File("src/temp.txt");           //Here we are using Relative path

        System.out.println("Absolute path "+file.getAbsolutePath());             //C:/Users/hnmnj/development/RTT-116CLASSWORK/Module-303/Module-303/temp.txt
        System.out.println("Relative PAth : "+file.getPath());
        System.out.println(file.getName());
        System.out.println("is Directory: " + file.isDirectory());
        System.out.println("is Hidden: " + file.isHidden());
        System.out.println("can Read: " + file.canRead());
        System.out.println("can Write: " + file.canWrite());
        System.out.println("can execute: " + file.canExecute());
        System.out.println("size "+file.length());
        System.out.println("exists "+file.exists());

        if(file.isDirectory()) {
            //lets list the file in this directory
           File[] file1 = file.listFiles();
           for(File f : file1) {
               System.out.println("===>"+f.getName());
           }
        }

        //!!!!!!!!!!!!!!!!!BE VERY V V V V CAREFUL when deleting a file
        //file.delete();

        File newDirectory = new File("newDirectory");
        newDirectory.mkdir();





    }
}
