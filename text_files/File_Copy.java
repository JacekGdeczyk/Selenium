package text_files;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class File_Copy {
    public static void main(String[] args) throws IOException {

        File file = new File("C:/Users/hp1/Documents/Nowy.txt");
        File file0 = new File("C:/Users/hp1/Documents/Nowy0.txt");
        File dir = new File("C:/Users/hp1/Documents/Dir");
        File file1 = new File("C:/Users/hp1/Documents/Nowy1.txt");

        FileUtils.copyFile(file, file0);
        FileUtils.copyFileToDirectory(file, dir);
        FileUtils.moveFile(file, file1);
    }
}
