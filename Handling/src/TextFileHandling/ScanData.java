package TextFileHandling;

import java.util.Scanner;

public class ScanData 

{

	
	public static void main(String[] args) 
	{
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Insert a new string: ");
		String s= sc.nextLine();
		System.out.println("Here is the input string \n"+s);
	}
}
