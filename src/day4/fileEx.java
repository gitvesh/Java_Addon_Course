package day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class fileEx {
    public static void findfile()throws IOException {
        File newfile=new File("test.txt");
        FileInputStream fs=new FileInputStream(newfile);

    }

    public static void main(String[] args) {
        try {
            findfile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
