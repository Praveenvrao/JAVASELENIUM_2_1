package DAY22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DD_WritingDATA1 {

	public static void main(String[] args) throws Exception {
		// Writing the testdata file
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("WDATA1");
		XSSFRow row1 = sheet.createRow(0);
			row1.createCell(0).setCellValue("S NO");
			row1.createCell(1).setCellValue("NAME");
			row1.createCell(2).setCellValue("COMPANY");
			row1.createCell(3).setCellValue("SALARY");
		XSSFRow row2 = sheet.createRow(1);
			row2.createCell(0).setCellValue("1");
			row2.createCell(1).setCellValue("NOMAN");
			row2.createCell(2).setCellValue("IBM");
			row2.createCell(3).setCellValue("100K");
		XSSFRow row3 = sheet.createRow(2);
			row3.createCell(0).setCellValue("2");
			row3.createCell(1).setCellValue("Rahul");
			row3.createCell(2).setCellValue("TCS");
			row3.createCell(3).setCellValue("120K");
		XSSFRow row4 = sheet.createRow(3);
			row4.createCell(0).setCellValue("3");
			row4.createCell(1).setCellValue("SURYA");
			row4.createCell(2).setCellValue("INFY");
			row4.createCell(3).setCellValue("99K");
			
		FileOutputStream File2 = new FileOutputStream(System.getProperty("user.dir")+ "\\TESTDATA\\WTestdata1.xlsx");
		workbook.write(File2);
		workbook.close();
		File2.close();
		
		int rowno = sheet.getLastRowNum();
		int cellno = sheet.getRow(1).getLastCellNum();
		System.out.println("No of rows > "+ rowno);
		System.out.println("No of cells > "+ cellno);
		
		FileInputStream File1 = new FileInputStream(System.getProperty("user.dir")+ "\\TESTDATA\\WTestdata1.xlsx");
		XSSFWorkbook workbook2 = new XSSFWorkbook(File1);
		XSSFSheet sheet2 = workbook2.getSheet("WDATA1");
		
		for(int r =0; r<=rowno; r++) {
			XSSFRow currentRow = sheet.getRow(r);
			for(int c=0; c<cellno; c++) {
				XSSFCell currentCell = currentRow.getCell(c);
				System.out.print(currentCell.toString() + "\t");
			}
			System.out.println();
		}
		

	}

}
