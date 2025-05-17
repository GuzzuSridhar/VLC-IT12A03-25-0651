package fileio;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        // File Reader object
        FileReader fileReader = new FileReader("myfile.txt");
        int ch;
        while ((ch = fileReader.read()) != -1) {
            char val = (char) ch;
            System.out.print(val);
            // System.out.print(ch);
        }
    }
}
