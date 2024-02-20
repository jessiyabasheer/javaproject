package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	static FileInputStream file;
	static XSSFWorkbook book;
	static XSSFSheet sheet;
	
public static String readStringData(int row,int coloumn) throws IOException 
{
file=new FileInputStream("C:\\Users\\dell\\OneDrive\\Desktop\\exceljava.xlsx");	
book=new XSSFWorkbook(file);
sheet=book.getSheet("Sheet1");
Row r=sheet.getRow(row);
Cell c=r.getCell(coloumn);
return c.getStringCellValue();

}
public static String readIntegerData(int row,int coloumn) throws IOException
{
	file=new FileInputStream("C:\\Users\\dell\\OneDrive\\Desktop\\exceljava.xlsx");	
	book=new XSSFWorkbook(file);
	sheet=book.getSheet("Sheet1");
	Row r=sheet.getRow(row);
	Cell c=r.getCell(coloumn);
	int a=(int)c.getNumericCellValue();
	return String.valueOf(a);
}

}