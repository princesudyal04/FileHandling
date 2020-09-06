package TextFileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDataRead2 
{

	public static void main(String[] args) throws IOException 
	{
	//firstly make connection with the file using file class
		File f =new File("../File_handling/src/TextFileHandling/file_handle.txt");
		FileReader fr =new FileReader(f);         //here it throws the error so use throws //FileReader is used to read data char by char
		BufferedReader b= new BufferedReader(fr);    //BufferedReader is used to read data line by line
		String s;
		while((s=b.readLine())!=null) 
		{
			System.out.println(s);
		}
	}	

}
