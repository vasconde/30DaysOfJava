// I'm in day 06

package my_first_program;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyFirstProgram {
	
	public static void main (String[] args) throws FileNotFoundException
	{
		
		Scanner in = new Scanner(new File("students.txt"));
		
		ArrayList<String> students = new ArrayList<String>();
		
		while(in.hasNextLine())
		{
			students.add(in.nextLine());
		}
		
		in.close();
		
		for (int i = 0; i < students.size(); i++)
		{
			System.out.println(i + ". " + students.get(i));
		}
	}

}
