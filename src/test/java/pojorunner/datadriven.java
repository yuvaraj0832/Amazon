package pojorunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class datadriven {
	@Test
	public  static void to_read_data() throws IOException {
	File source=new File("C:\\Users\\ADMIN\\eclipse-workspace\\Customer\\target\\Book1.xlsx");
	FileInputStream input=new FileInputStream(source);
	Workbook book=new XSSFWorkbook(input);
	Cell cell = book.getSheet("Sheet1").getRow(1).getCell(1);
	CellType cellType = cell.getCellType();
	if(cellType.equals(cellType.STRING)) {
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
	}else if (cellType.equals(cellType.NUMERIC)) {
		double numericCellValue = cell.getNumericCellValue();
		System.out.println(numericCellValue);	
	}
	}	
@Test
public static void Write_data() throws IOException{
	File source1=new File("C:\\Users\\ADMIN\\eclipse-workspace\\Customer\\target\\Book1.xlsx");
	FileInputStream input=new FileInputStream(source1);
	Workbook book=new XSSFWorkbook(input);
	book.createSheet("yuvaraj").createRow(0).createCell(0).setCellValue("gopal");
	book.getSheet("yuvaraj").getRow(0).createCell(1).setCellValue("raj");
	FileOutputStream data=new FileOutputStream(source1);
	book.write(data);
	book.close();
}
}
	
	

	


