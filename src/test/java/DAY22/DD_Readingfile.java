package DAY22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DD_Readingfile {

	public static void main(String[] args) throws Exception {
		// Reading the excel file
		
//		WebDriver driver = new ChromeDriver();
		FileInputStream File1 = new FileInputStream(System.getProperty("user.dir")+"\\TESTDATA\\Testdata1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(File1);
		XSSFSheet sheet = workbook.getSheet("DATA1");
		int rowno = sheet.getLastRowNum();
		int cellno = sheet.getRow(0).getLastCellNum();
		
		System.out.println("No of rows > "+ rowno);
		System.out.println("No of cells > "+cellno);
		
		for(int r =0; r<=4; r++) {
			XSSFRow currentRow = sheet.getRow(r);
			for(int c=0;c<5;c++) {
				XSSFCell currentCell = currentRow.getCell(c);
				String cellvalue = currentCell.toString();
				System.out.print(cellvalue + "\t");
			}
			System.out.println();
		}
		
		System.out.println(sheet.getRow(2).getCell(4));
		workbook.close();
		File1.close();
		
		

	}

}
