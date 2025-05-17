package fileio;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        // File create a file object
        File file = new File("myfile.txt"); // the file is created in the current dir
        try {
            if (file.createNewFile()) // has to handle the checked exception
                System.out.println("File Created");
            else
                System.out.println("File already Exists");
        } catch (IOException e) {
            System.out.println("File not created");
        }
    }
}
