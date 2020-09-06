package ExcelFileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Assignment4 
{
	
	public void WriteData(int row, int column, String data) throws IOException, RowsExceededException, WriteException
	{
		File f= new File("C:\\Users\\hppc\\Desktop\\write.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("Sheet_1", 0);
		int i, j;
		for (i=0; i<=row; i++) 
		{
           if (i==row)
           {
			for (j=0; j<column; j++) 
			{
				Label l= new Label(j, i,data);  
				ws.addCell(l);
			}
           }
		}
		wk.write();     //for saving
		wk.close();     //for closing
	}
	

	public static void main(String[] args) throws RowsExceededException, WriteException, IOException
	{
		Assignment4 obj =new Assignment4();
		Scanner sc= new Scanner(System.in);
		System.out.println("Please insert the row number: ");
		int row= sc.nextInt();
		System.out.println("Please insert the column number");
		int column= sc.nextInt();
		System.out.println("Please provide the data you want to insert: ");
		String data= sc.next();
		obj.WriteData(row, column, data);
		sc.close();
		
	}
	
}
