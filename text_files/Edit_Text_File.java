package text_files;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Edit_Text_File {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/hp1/Documents/Nowy.txt");

        FileUtils.write(file, "Wal się","UTF-8",true);
    }
}
