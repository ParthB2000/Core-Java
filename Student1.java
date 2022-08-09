import java.util.Scanner;

public class Student1 
{
	int id2;
	String name2;

	public static void main(String[] args) {
		{
			
			Scanner sc = new Scanner(System.in);
			
			Student1 s1 = new Student1();
			Student1 s2 = new Student1();
			
			System.out.println("Enter your id");
			int id = sc.nextInt();
			System.out.println("Enter your name");
			String name = sc.next();
			
			s1.id2 = id;
			s1.name2 = name;
			
			System.out.println(s1.id2+ " " +s1.name2);
		}
	}
	
}
   
