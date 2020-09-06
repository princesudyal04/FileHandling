package ExcelFileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment3 
{

	public void ReadDataFromRange(int start, int end) throws BiffException, IOException
	{
		File f= new File("../Handling/src/ExcelFileHandling/input.xls");
		Workbook wk =Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int r= ws.getRows();
		int c= ws.getColumns();
		for(int i=start; i<=end;i++)
		{
			for (int j=0; j<4; j++) 
				{
				Cell cel= ws.getCell(j, i);
				System.out.println(cel.getContents());
				}
			System.out.println();
		}
	}
	public static void main(String[] args) throws BiffException, IOException 
	{
       Assignment3 obj =new Assignment3();
       Scanner sc= new Scanner(System.in);
      System.out.println("Please insert the start of Row number: ");
       int start =sc.nextInt();
       System.out.println("Please insert the end range of Row number: ");
       int end = sc.nextInt();
       obj.ReadDataFromRange(start, end);
	}
	
}
