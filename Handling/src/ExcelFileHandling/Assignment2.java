package ExcelFileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment2 
{

	public void ReadDataFromRow(int row) throws BiffException, IOException
	{
		File f= new File("../Handling/src/ExcelFileHandling/input.xls");
		Workbook wk =Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int r= ws.getRows();
		int c= ws.getColumns();
		for(int i=0; i<r;i++)
		{
			if (i==row) 
			{
			for (int j=0; j<c; j++) 
			{
				Cell cel= ws.getCell(j, i);
				System.out.println(cel.getContents());
			}
			}
		}
	}
	public static void main(String[] args) throws BiffException, IOException 
	{
       Assignment2 obj =new Assignment2();
       Scanner sc= new Scanner(System.in);
      System.out.println("Please insert the Row number: ");
       int row =sc.nextInt();
       obj.ReadDataFromRow(row);
	}
	
}
