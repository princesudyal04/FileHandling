package TextFileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDataRead 
{
	
public static void main(String[] args) throws IOException 
{
//firstly make connection with the file using file class
	File f =new File("../File_handling/src/TextFileHandling/file_handle.txt");
	FileReader fr =new FileReader(f);         //here it throws the error so use throws //FileReader is used to read data char by char
	int a;
	while((a=fr.read())!=-1)   //-1 means end of the file has been reached
	{
		System.out.println((char)a);
	}
}	
	
}
