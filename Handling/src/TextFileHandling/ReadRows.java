package TextFileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadRows 
{

	public void ReadData(int Row) throws IOException 
	{
		File f =new File("../File_handling/src/TextFileHandling/Reader.txt");
		FileReader fr= new FileReader(f);
		BufferedReader b= new BufferedReader(fr);
		String s;
        int counter=0;
        while((s=b.readLine())!=null)
        {
        	counter=counter+1;
        	if (counter==Row)
        	{
        		System.out.println(s);
        		break;
        	}

        }
		
	}
	public static void main(String[] args) throws IOException 
	{
		ReadRows obj=new ReadRows();
		System.out.println("Please Insert the particular line from which you want to read the data: ");
		Scanner sc =new Scanner(System.in);
		int row=sc.nextInt();
		obj.ReadData(row);
		
	}
}
