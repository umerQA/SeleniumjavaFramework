package utility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutil {
	
	
	static XSSFWorkbook workbook;
	static XSSFSheet  sheet;
	
	
	public Excelutil(String excelPath,String sheetName) throws IOException{
	
		
		 workbook = new XSSFWorkbook(excelPath);
		 sheet = workbook.getSheet(sheetName);
	}
	
	public static void main(String[] args) throws IOException {
		//getRowCount();
		//getCellDataString(0,0);
		//getCellDatNumber(1,1);
	}


	public static int getRowCount()  {
		int rowCount=0;
		try 
		{
		
			rowCount  = sheet.getPhysicalNumberOfRows();
		System.out.println("no of rows  :" +rowCount);
		}
		
		catch (Exception e){
			e.printStackTrace();	
			}
		
		return rowCount;
			}
	

	public static int getColCount()  {
		int colCount=0;
		try{
		
	 colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("no of col  :" +colCount);
		
	}
		catch (Exception e){
		e.printStackTrace();	
		}
		return colCount;
		}
	public static String getCellDataString(int rownum,int colnum) { 
	String cellData=null;
try{
		
		
		 
		 cellData =sheet.getRow( rownum).getCell( colnum).getStringCellValue();
		System.out.println(cellData);
	}
	catch (Exception e){e.printStackTrace();
	
	}
return cellData;
	}
	public static void getCellDatNumber(int rownum,int colnum) throws IOException{
		
		
		double cellData =sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
		System.out.println(cellData);
	}

	}


