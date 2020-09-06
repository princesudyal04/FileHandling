package TextFileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile 
{

	public void WriteData(int range,String data) throws IOException
	{
		File f=new File("../File_handling/src/TextFileHandling/Writer.txt");
		FileWriter wr= new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(wr);
		int counter=1;
		while(counter<=range) 
		{
			bw.write(data);
			bw.newLine();
			counter++;
		}
		bw.close();
		
	}
	
	public static void main(String[] args) throws IOException 
	{
		WriteToFile obj=new WriteToFile();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please insert the string:");
		String data= sc.nextLine();                    //use nextLine() ahead of nextInt() because nextInt() only consumes the number not the end of the Line
		System.out.println("Please insert the range upto which string has been printed:");
		int range=sc.nextInt();
		obj.WriteData(range, data);
		sc.close();
		
	}
	
}
