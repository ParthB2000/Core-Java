/*Write a program in Java to make such a pattern like right angle triangle 
with number increased by 1 The pattern like:
1
22
333
4444
55555*/

public class Pattern 
{
	public static void main(String[] args) 
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
				System.out.println();
		}
	}
}
