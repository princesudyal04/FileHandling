package ExcelFileHandling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Copy 
{
 public void CopyData() throws BiffException, IOException, RowsExceededException, WriteException
 {
	 File f1= new File("C:\\Users\\hppc\\Desktop\\input.xls");
	 File f2= new File("C:\\Users\\hppc\\Desktop\\copy.xls");
	 Workbook wk= Workbook.getWorkbook(f1);
	 Sheet ws= wk.getSheet(0);
	 int row=ws.getRows();
	 int col=ws.getColumns();
	 WritableWorkbook wr= Workbook.createWorkbook(f2);
	 WritableSheet wsh= wr.createSheet("Sheet_1", 0);
	 for(int i=0; i<row;i++)
	 {
		 for (int j=0;j<col;j++)
		 {
			 Cell cel=ws.getCell(j, i);
			 System.out.println(cel.getContents());
			 String s=cel.getContents();
			 Label l= new Label(j, i, s);
			 wsh.addCell(l);
			 
		 }
		 System.out.println();
	 }
		wr.write();     //for saving
		wr.close();     //for closing
 }
	
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException 
	{
		Copy obj=new Copy();
		obj.CopyData();
		
	}
}
