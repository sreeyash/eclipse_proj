package calculator;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Cal {

	
	@Test
	public void calculate()
	{
      Scanner scan=new Scanner(System.in);
		
      int a=scan.nextInt();
      
      int b=scan.nextInt();
      
      int c=a+b;
   
      System.out.println("Addition:"+c);
      
	}

}
