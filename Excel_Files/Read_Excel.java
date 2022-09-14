package Excel_Files;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class Read_Excel {
    public static void main(String[] args){

        File file = new File("C:/Users/hp1/Documents/Nowy.xlsx");

        XSSFWorkbook wkbook;
        XSSFSheet sheet;

        try {
            FileInputStream excel = new FileInputStream(file);
            wkbook = new XSSFWorkbook(excel);
            sheet = wkbook.getSheet("Arkusz1");
            int start = sheet.getFirstRowNum();
            int end = sheet.getLastRowNum();
            for (int i = start; i <= end; i++) {
                System.out.print(sheet.getRow(i).getCell(0).getStringCellValue() + "\t");
                System.out.print(sheet.getRow(i).getCell(1).getNumericCellValue() + "\t");
                System.out.print(sheet.getRow(i).getCell(2).getBooleanCellValue() + "\t")     ;
                System.out.println(sheet.getRow(i).getCell(3).getDateCellValue());
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
