/*Write a Java program to count the letters, spaces, numbers and other
characters of an input string.*/

import java.util.Scanner;

public class String_length 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string ");
		String any1 = sc.next();
		Count(any1);
		
	}

	private static void Count(String any1) 
	{
		// TODO Auto-generated method stub
		char[] ch = any1.toCharArray();
		int letter = 0;
		int spaces = 0;
		int num = 0;
		int otherchar = 0;
		for(int i=0;i<any1.length();i++)
		{
			if(Character.isLetter(ch[i]))
			{
				letter++;
			}
			else if(Character.isDigit(ch[i])) 
			{
				num++;
			}
			else if(Character.isSpaceChar(ch[i])) 
			{
				spaces++;
			}
			else 
			{
				otherchar++;
			}
		}
		
			System.out.println("The string is: " + any1);
			System.out.println("Letters: " + letter);
			System.out.println("Space: " + spaces);
			System.out.println("Numbers: " + num);
			System.out.println("Other: " + otherchar);
		
	}
}
