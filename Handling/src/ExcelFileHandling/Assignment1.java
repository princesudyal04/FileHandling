package ExcelFileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment1 
{
	public void ReadDataFromCell(int row, int col) throws BiffException, IOException
	{
		File f= new File("../Handling/src/ExcelFileHandling/input.xls");
		Workbook wk =Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int r= ws.getRows();
		int c= ws.getColumns();
		for(int i=0; i<r;i++)
		{
			for (int j=0; j<c; j++) 
			{
				if (j==col && i==row) 
				{
				Cell cel= ws.getCell(j, i);
				System.out.println(cel.getContents());
				}
			}
		}
	}
	public static void main(String[] args) throws BiffException, IOException 
	{
       Assignment1 obj =new Assignment1();
       Scanner sc= new Scanner(System.in);
      System.out.println("Please insert the Row number: ");
       int row =sc.nextInt();
       System.out.println("Please insert the column number: ");
       int col = sc.nextInt();
       obj.ReadDataFromCell(row, col);
	}
	
}
