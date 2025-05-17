package fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        // create a file writer object
        try {
            // using the FileWriter, one character at a time is written
            // FileWriter writer = new FileWriter("myfile.txt"); // write to the file in
            // current dir
            FileWriter writer = new FileWriter("myfile.txt", true); // update to the file in current dir
            writer.write("Hello, this is a test.\n");
            writer.write("This line is written to a file.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // use the bufferred writer to buffer the text and write to a file
        // the buffer size is 8kb

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("myfile.txt", true));
            bufferedWriter.write("Using buffered writer.\n");
            bufferedWriter.write("Hello, this is a test.\n");
            bufferedWriter.write("Hello, this is a test.\n");
            bufferedWriter.write("Hello, this is a test.\n");
            bufferedWriter.close();
        } catch (IOException ie) {
            ie.getMessage();
        }
    }
}
