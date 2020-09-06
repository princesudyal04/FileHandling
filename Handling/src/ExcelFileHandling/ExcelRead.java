package ExcelFileHandling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelRead 
{

	public static void main(String[] args) throws BiffException, IOException 
	{
     
		File f= new File("C:\\Users\\hppc\\Desktop\\DataFile.xls");
		Workbook wk= Workbook.getWorkbook(f);      //Excel file
		Sheet ws= wk.getSheet(0);                  //Sheet no. 1 of excel file
		int row= ws.getRows();                     //total no. of rows
		int col= ws.getColumns();                    //total no. of columns
		System.out.println("Total no. of Rows: "+row);
		System.out.println("Total no, of columns: "+col);
		
		for (int i=0; i<row; i++)  //loop for fetching rows
		{
			for (int j=0; j<col; j++)   //loop for getting columns
			{
				Cell c= ws.getCell(j, i);    //location of the cell
				System.out.println(c.getContents());      //content on particular cell location
				
			}
		}
		
	}

}