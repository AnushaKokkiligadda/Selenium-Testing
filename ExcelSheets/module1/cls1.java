package module1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class cls1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("D:\\text1.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(f);
		XSSFSheet ws=w.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
		Iterator<Row>rows=ws.iterator();
		while(rows.hasNext()) {
			r=rows.next();
			Iterator<Cell>cell=r.iterator();
			while(cell.hasNext()) {
				c=cell.next();
				if(c.getCellType()==c.CELL_TYPE_STRING) {
					System.out.println(c.getStringCellValue());
				}
				else if(c.getCellType()==c.CELL_TYPE_NUMERIC) {
					System.out.println(c.getNumericCellValue());
				}
			}
			
		}
		
		
		
		

	}

}
