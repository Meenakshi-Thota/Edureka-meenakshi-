package Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Excel {	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public Excel(String filepath) {
		try {
		File f=new File(filepath);
		FileInputStream fis = new FileInputStream(f);
		wb=new XSSFWorkbook(fis);
	    }
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
		public String getdata(int sheetno,int rowno,int cell) {
			sheet=wb.getSheetAt(sheetno);
			String data=new DataFormatter().formatCellValue(sheet.getRow(rowno).getCell(cell));	
			return data;
		}
		public int getRowCount(int sheetindex) {
			int row=wb.getSheetAt(sheetindex).getLastRowNum();
			return row; 
			}	
}