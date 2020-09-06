package ExcelFileHandling;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Excelwrite 
{

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException 
	{
		File f= new File("C:\\Users\\hppc\\Desktop\\write.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("Sheet_1", 0);
		for (int i=0; i<5; i++) 
		{
			for (int j=0; j<5; j++) 
			{
				Label l= new Label(j, i, "DC");   //3 parametrized constructor
				ws.addCell(l);
			}

		}
		wk.write();     //for saving
		wk.close();     //for closing 
	}
}
