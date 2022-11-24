package keyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calling {
	static WebDriver d;
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		class1 c1=new class1(d);
		FileInputStream f1=new FileInputStream("D:\\keys.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
		Iterator<Row> row=ws.iterator();
		while(row.hasNext()) {
			r=row.next();
			r=ws.getRow(2);
			c=r.getCell(2);
			String s1=c.getStringCellValue();
			if(s1.equals("Opening_browser")) {
				c1.Opening_browser();
			}
			else if(s1.equals("Navite")) {
				c1.Navite();
			}
			else if(s1.equals("User_name")) {
				c1.User_name();
			}
			else if(s1.equals("Password")) {
				c1.Password();
			}
			else if(s1.equals("Click")) {
				c1.Click();
			}
			else {
				c1.Close();
			}
			
		}
		

	}

}
