package Excel_Files;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write_Excel {
    public static void main(String[] args) {
        File file = new File("C:/Users/hp1/Documents/Nowy2.xlsx");

        XSSFWorkbook wkbook = new XSSFWorkbook();
        XSSFSheet sheet = wkbook.createSheet("Arkusz4");
        Row row;
        Cell cell;

        row = sheet.createRow(0);
        cell = row.createCell(0);

        cell.setCellValue("Hello World");

        try {
            FileOutputStream excel = new FileOutputStream(file);
            wkbook.write(excel);
            excel.close();
            wkbook.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
