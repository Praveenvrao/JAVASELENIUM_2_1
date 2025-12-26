package DAY22;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DD_DynamicTestdatawrite {

	public static void main(String[] args) throws Exception {
		// Creating testdata file dynamically
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("DYNDATA");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows");
		int rowno = sc.nextInt();
		System.out.println("Enter no of coloumns");
		int cellno = sc.nextInt();
		
		for(int r =0; r<=rowno; r++) {
			XSSFRow currentRow = sheet.createRow(r);
			for(int c =0; c<cellno; c++) {
				XSSFCell currentCell = currentRow.createCell(c);
				currentCell.setCellValue(sc.next());
			}
			System.out.println();
		}
		FileOutputStream File1 = new FileOutputStream(System.getProperty("user.dir")+ "\\TESTDATA\\WDYNTestdata1.xlsx");
		workbook.write(File1);
		workbook.close();
		File1.close();
		
		System.out.println("FILE IS CREATED SUCCESSFULLY");

	}

}
