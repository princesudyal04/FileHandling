package TextFileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile 
{
	
	public static void main(String[] args) throws IOException 
	{
		File fread= new File("../File_handling/src/TextFileHandling/File1.txt");
		File fwrite= new File("../File_handling/src/TextFileHandling/File2.txt");
		FileReader fr= new FileReader(fread);
		FileWriter fw= new FileWriter(fwrite);
		BufferedReader br=new BufferedReader(fr);
		BufferedWriter bw=new BufferedWriter(fw);
		String s;
		while((s=br.readLine())!=null)
		{
			System.out.println(s); // to check what type of data in file1 other wise skip this
			bw.write(s);
			bw.newLine();
		}
		bw.close();
	}
}
