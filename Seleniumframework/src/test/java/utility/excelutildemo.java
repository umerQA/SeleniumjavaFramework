package utility;

import java.io.IOException;

public class excelutildemo {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		
		String projectPath= System.getProperty("user.dir");
		try {
			Excelutil excel = new Excelutil(projectPath+"/excel/data.xlsx", "Sheet1");
			excel.getRowCount();
			excel.getCellDataString(0, 0);
			excel.getCellDatNumber(0, 0);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

