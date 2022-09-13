package text_files;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Intro {
    public static void main(String[] args) throws IOException {

        File file = new File("C:/Users/hp1/Documents/Nowy.txt");
        String x = FileUtils.readFileToString(file, "UTF-8");
        System.out.println(x);


    }
}
