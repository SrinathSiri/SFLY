package apchepoi;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadTestData {
    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\v-srinath.sirimalla\\Downloads\\Testdata.xlsx");
        FileInputStream fis = new FileInputStream(file);
        Workbook workbook = WorkbookFactory.create(fis);
        System.out.println("Number of sheets : "+workbook.getNumberOfSheets());
        Sheet sheet = workbook.getSheet("Sheet1");
        System.out.println("Total no. of rows : "+sheet.getPhysicalNumberOfRows());
        System.out.println("First row number is : "+sheet.getFirstRowNum());
        System.out.println("Last Row number is : "+sheet.getLastRowNum());
        System.out.println("Total no. of columns : "+sheet.getRow(0).getPhysicalNumberOfCells());
        System.out.println("First col number is : "+sheet.getRow(0).getFirstCellNum());
        System.out.println("Last col number is : "+sheet.getRow(0).getLastCellNum());

        for(int rowIndex=sheet.getFirstRowNum()+1;rowIndex<=sheet.getLastRowNum();rowIndex++){
            for(int colIndex=sheet.getRow(rowIndex).getFirstCellNum();colIndex<sheet.getRow(rowIndex).getLastCellNum();colIndex++){
                System.out.println(sheet.getRow(rowIndex).getCell(colIndex).toString()+"\t");
            }
        }



    }

}
