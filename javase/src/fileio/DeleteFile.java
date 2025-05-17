package fileio;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("myfile.txt");
        if (file.exists())
            file.delete();
        else
            System.out.println("File does not exist");
    }

}
