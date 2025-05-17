package fileio;

import java.io.File;

public class Dir {
    public static void main(String[] args) {
        File file = new File("dir1"); // any file name without an extension is a directory
        file.mkdir();

        File file1 = new File("dir2\\dir3"); // create a directory with sub directory
        file1.mkdirs();

        System.out.println("--------------");
        // director listing
        File myProjects = new File("D:\\VLC-IT12A03-25-0651\\javase\\src");
        String[] files = myProjects.list();
        for (String fname : files) {
            System.out.println(fname);
        }
    }
}
