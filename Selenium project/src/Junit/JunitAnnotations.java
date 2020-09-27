package Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitAnnotations 

{
    @Test
	public void tc()
	{
		System.out.println("TestCase one annotaion");    //execute after the before annotation
	}
    @Test
 		public void tc2()
 		{
 			System.out.println("TestCase two annotaion");
 		}
	@Before
	public void befo()
	{
		System.out.println("Before one annotaion");        //execute first
	}
	@After
	public void after()
	{
		System.out.println("After one annotaion");         //execute after the Test annotaion
	}
	
	@BeforeClass
	public static void Bclass() 
	{
		System.out.println("Before Class annotaion");     //for Before and After class annotation the method should be static
	}
	
	@AfterClass
	public static void Aclass() 
	{
		System.out.println("After Class annotaion"); 
	}
}
