package TextFileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadRange 
{

	public void ReadDataofRange(int initial, int end) throws IOException 
	{
		File f =new File("../File_handling/src/TextFileHandling/Reader.txt");
		FileReader fr= new FileReader(f);
		BufferedReader b= new BufferedReader(fr);
		String s;
		int counter=0;
		while((s=b.readLine())!=null)
		{
			counter=counter+1;
			if(counter==initial && counter<=end) 
			{
            	 System.out.println(s);
            	 initial++;
			}
		}
     	}
	public static void main(String[] args) throws IOException 
	{
		ReadRange obj=new ReadRange();
		Scanner sc =new Scanner(System.in);
		System.out.println("Please Insert the initial row number from where you start reading: ");
		int initial=sc.nextInt();
		System.out.println("Please Insert the end of the row number upto where you want to read the data");
		int end=sc.nextInt();
		obj.ReadDataofRange(initial,end);
		
	}
}
