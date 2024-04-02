package video34;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlsheett {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1. Read file
		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		//2. open workbook
		XSSFWorkbook wkbook= new XSSFWorkbook(file);
		//3. capture sheet
		XSSFSheet seet= wkbook.getSheet("Sheet1");
		//4.get no of rows
		int totrow= seet.getLastRowNum();
		//5. get no of cells
		int totcells=seet.getRow(1).getLastCellNum();
		//6. print then
		System.out.println("No of row:-"+totrow);
		System.out.println("No of cells:-"+totcells+"\n");
		
		for(int i=0;i<=totrow;i++)
		{
			XSSFRow currentrow= seet.getRow(i);
			for(int j=0;j<totcells;j++)
			{
				XSSFCell cell= currentrow.getCell(j);
				String value= cell.toString();
				System.out.println(value+"		");
			}
			System.out.println();
				
		}
		wkbook.close();
		file.close();
		
	}
		
		
		
}


