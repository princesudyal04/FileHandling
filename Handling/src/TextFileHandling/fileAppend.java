package TextFileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileAppend 
{

	
	public static void main(String[] args) throws IOException 
	{
	//firstly make connection with the file using file class
		File f =new File("../File_handling/src/TextFileHandling/file_handle2.txt");
		FileWriter wr=new FileWriter(f, true);
		BufferedWriter b= new BufferedWriter(wr);
		b.newLine();
        b.write("New data in the file");
        b.close();
	}
}
