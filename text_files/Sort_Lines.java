package text_files;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Sort_Lines {
    public static void main(String[] args) throws IOException {

        File file = new File("C:/Users/hp1/Documents/Nowy.txt");

        List<String> list = FileUtils.readLines(file, "UTF-8");

        Collections.sort(list);

        FileUtils.write(file, "", "UTF-8", false);

        for (String s : list) {
            FileUtils.write(file, "", "UTF-8", false);
            System.out.println(s);
                }
    }
}
