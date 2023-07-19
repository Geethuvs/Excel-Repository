package NewMavenPack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class  Newxcel{
	static FileInputStream f1;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	
	public static String getStringData(int a, int b) throws IOException
	{
		f1=new FileInputStream("C:\\Users\\geeth\\OneDrive\\Documents\\NewExcel.xlsx"); // to obtain input bytes from a file
		w=new XSSFWorkbook(f1);	// instance to refer workbook
		sh=w.getSheet("Login"); // to get first sheet
		Row r= sh.getRow(a);
		Cell c=r.getCell(b);
		return c.getStringCellValue();
		
	}
	
	public static String getIntegerData(int a, int b) throws IOException
	{
		f1=new FileInputStream("C:\\Users\\geeth\\OneDrive\\Documents\\NewExcel.xlsx"); // to obtain input bytes from a file
		w=new XSSFWorkbook(f1);	// instance to refer workbook
		sh=w.getSheet("Login"); // to get first sheet
		Row r= sh.getRow(a);
		Cell c=r.getCell(b);
		int x=(int)c.getNumericCellValue();//converting to integer
		return String.valueOf(x);
		
	}

	
}
