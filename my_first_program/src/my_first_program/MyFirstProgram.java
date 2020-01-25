package my_first_program;

import java.util.Scanner;

public class MyFirstProgram {
	
	public static void main (String[] args)
	{
		System.out.println("hello world!");
		
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		
		if (s.equals("caleb"))
		{
			System.out.println("hey caleb");
		}
		else if (s.equals("lol"))
		{
		System.out.println("lol lol");
		}
		else
		{
			System.out.println("I dont know you");
		}
		
		in.close();
	}

}
