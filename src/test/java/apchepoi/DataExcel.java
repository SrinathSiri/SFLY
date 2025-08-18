package apchepoi;

import com.sfly3.base.Browser;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;

public class DataExcel extends Browser {

    public String[][] getData(String path,String sheetnm) throws Exception {
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet(sheetnm);

        String[][] data = new String[sheet.getPhysicalNumberOfRows() - 1][sheet.getRow(1).getPhysicalNumberOfCells()];

        for (int rowIndex = sheet.getFirstRowNum() + 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
            for (int colIndex = sheet.getRow(rowIndex).getFirstCellNum(); colIndex < sheet.getRow(rowIndex).getLastCellNum(); colIndex++) {
                if (ObjectUtils.isNotEmpty(sheet.getRow(rowIndex).getCell(colIndex))) {
                    data[rowIndex - 1][colIndex] = sheet.getRow(rowIndex).getCell(colIndex).toString();
                } else {
                    data[rowIndex - 1][colIndex] = null;
                }
            }
        }
        workbook.close();
        return data;
    }

    @DataProvider(name = "DataTestExcel")
    public  String[][] getDataTest() throws Exception {
        return getData("C:\\Users\\v-srinath.sirimalla\\AutomationWorkspace\\SFLY\\exceldata\\Testdata.xlsx","Sheet1");
    }

}
