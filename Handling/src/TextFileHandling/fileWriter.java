package TextFileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter 
{
	public static void main(String[] args) throws IOException 
	{
	//firstly make connection with the file using file class
		File f =new File("../File_handling/src/TextFileHandling/file_handle2.txt");
		FileWriter wr=new FileWriter(f);
		// wr.write("My name is Shubham Sudyal \n");    // if you want to execute it to next line instead of \n use newline()
		// wr.write("I am brother of Prince Sudyal");
		// wr.close();    // for saving and closing the file

		
		BufferedWriter b= new BufferedWriter(wr);
		b.write("First row of file");
		b.newLine();
		b.write("Second row of file");
		b.close();
	}
	
	
}
