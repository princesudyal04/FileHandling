package TextFileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileDataRead3 
{

	public static void main(String[] args) throws IOException 
	{
	//firstly make connection with the file using file class
		File f =new File("../File_handling/src/TextFileHandling/file_handle.txt");
        Scanner sc = new Scanner(f);
        
        while(sc.hasNextLine())
        {
        	System.out.println(sc.nextLine());
        }
	}	

}
