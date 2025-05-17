package fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        // File Reader object (one character at a time)
        FileReader fileReader = new FileReader("myfile.txt");
        int ch;
        while ((ch = fileReader.read()) != -1) {
            char val = (char) ch;
            System.out.print(val);
            // System.out.print(ch);
        }
        fileReader.close();

        System.out.println("----------------------");

        // buffered reader (8 kb at a time)
        FileReader reader = new FileReader("myfile.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        while (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
        }
        bufferedReader.close();
    }
}
