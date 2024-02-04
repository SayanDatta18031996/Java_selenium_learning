package ReadData;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFSheet;

@Test
public class App {

	public void readData() throws Exception {
		
		File file= new File("D:\\Education\\Code\\eclips_workspace\\ReadExcelData\\src\\test\\resources\\excel\\testdata.xlsx");
		FileInputStream fileInputStream= new FileInputStream(file);
		XSSFWorkbook xsf= new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = xsf.getSheetAt(0);
		String dataString= sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println("The excel data is : " + dataString);
		xsf.close();
		
	}
}
