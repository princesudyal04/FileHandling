package TextFileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFileInaRange 
{

	public void WriteDataInaRange(int initial,int end, String data) throws IOException
	{
		File f=new File("../File_handling/src/TextFileHandling/Writer.txt");
		FileWriter wr= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(wr);
        for(int i=1;i<=end;i++) 
         {
        	if(i>=initial && i<=end)
        	{
			bw.write(data);
			bw.newLine();
        	}
        	else 
        	{
        		bw.newLine();	
        	}
        	
		}
		bw.close();
		}
	
	public static void main(String[] args) throws IOException 
	{
		WriteToFileInaRange obj=new WriteToFileInaRange();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please insert the string:");
		String data= sc.nextLine();                    //use nextLine() ahead of nextInt() because nextInt() only consumes the number not the end of the Line
		System.out.println("Please insert the initial number from where we start: ");
		int initial=sc.nextInt();
		System.out.println("Please insert the end number upto which string has been writen:");
		int end=sc.nextInt();
		obj.WriteDataInaRange(initial,end , data);
		sc.close();
		
	}
	
	
	
}
