package dataDrivenTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\User\\Documents\\Employee.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet  sheet = workbook.getSheet("EMPSALARY");
		//XSSFSheet  sheet = workbook.getSheetAt(0);//get sheet as index
		
		int rowCount = sheet.getLastRowNum();//return the row count
		int colCount = sheet.getRow(0).getLastCellNum();//return column count
		
		for(int i=0; i<rowCount;i++) {
			XSSFRow currRow=sheet.getRow(i);  //focused on current row
			for(int j=0;j<colCount;j++) {
				String value=currRow.getCell(j).toString(); //read the value from a cell
				System.out.print("  " +value);
			}
			System.out.println();
		}
	}

}
