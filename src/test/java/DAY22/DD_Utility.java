package DAY22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Formatter;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import DAY20.Static_Table;

public class DD_Utility {
	
		public static FileInputStream FI;
		public static XSSFWorkbook wb;
		public static FileOutputStream FO;
		public static XSSFSheet sheet;
		public static XSSFRow row;
		public static XSSFCell cell;
		public static XSSFCellStyle style;
		
		public static int getrowcount(String excelfile, String sheetname) throws Exception {
			FI = new FileInputStream(excelfile);
			wb = new XSSFWorkbook(FI);
			sheet = wb.getSheet(sheetname);
			int rowcount = sheet.getLastRowNum();
			return rowcount;
		}
			
		public static int getcellcount(String excelfile, String sheetname, int rownumber) throws Exception{
			FI = new FileInputStream(excelfile);
			wb = new XSSFWorkbook(FI);
			sheet = wb.getSheet(sheetname);
			int cellcount = sheet.getRow(rownumber).getLastCellNum();
			return cellcount;
		}
		
		public static String getcelldata(String excelfile, String sheetname, int rownumber, int cellnumber) throws Exception{
			FI = new FileInputStream(excelfile);
			wb = new XSSFWorkbook(FI);
			sheet = wb.getSheet(sheetname);
			row = sheet.getRow(rownumber);
			cell = row.getCell(cellnumber);
			
			String data;
			try {
//				data = cell.toString();
				DataFormatter DF = new DataFormatter();
				data = DF.formatCellValue(cell);
			} catch (Exception e) {
				data = " ";
			}
			wb.close();
			FI.close();
			return data;
			}
		
		public static void setcelldata(String excelfile, String sheetname, int rownumber, int cellnumber, String data1) throws Exception {
			FI = new FileInputStream(excelfile);
			wb = new XSSFWorkbook(FI);
			sheet = wb.getSheet(sheetname);
			row = sheet.getRow(rownumber);
			cell = row.createCell(cellnumber);
			cell.setCellValue(data1);
			FO = new FileOutputStream(excelfile);
			wb.write(FO);
			wb.close();
			FI.close();
			FO.close();
		}

		

}
