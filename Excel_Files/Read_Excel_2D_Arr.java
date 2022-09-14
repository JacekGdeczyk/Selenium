package Excel_Files;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class Read_Excel_2D_Arr {
    public static void main(String[] args) {

        Object[][] arr2 = Read_Excel_Data();

        System.out.println(arr2[0][0]);
        System.out.println(arr2[2][2]);
        System.out.println(arr2[3][1]);
        System.out.println(arr2[8][3]);

    }

    public static Object[][] Read_Excel_Data() {
        File file = new File("C:/Users/hp1/Documents/Nowy.xlsx");

        XSSFWorkbook wkbook;
        XSSFSheet sheet;
        Object[][] arr = new Object[0][0];

        try {
            FileInputStream excel = new FileInputStream(file);
            wkbook = new XSSFWorkbook(excel);
            sheet = wkbook.getSheet("Arkusz1");
            int start = sheet.getFirstRowNum();
            int end = sheet.getLastRowNum();
            arr = new Object[end - start + 1][4];
            for (int i = start; i <= end; i++) {

                arr[i][0] = sheet.getRow(i).getCell(0).getStringCellValue();
                arr[i][1] = sheet.getRow(i).getCell(1).getNumericCellValue();
                arr[i][2] = sheet.getRow(i).getCell(2).getBooleanCellValue();
                arr[i][3] = sheet.getRow(i).getCell(3).getDateCellValue();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return arr;
    }
}


