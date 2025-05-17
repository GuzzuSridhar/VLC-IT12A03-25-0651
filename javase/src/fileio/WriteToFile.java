package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        // create a file writer object
        try {
            // FileWriter writer = new FileWriter("myfile.txt"); // write to the file in
            // current dir
            FileWriter writer = new FileWriter("myfile.txt", true); // update to the file in current dir
            writer.write("Hello, this is a test.\n");
            writer.write("This line is written to a file.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
