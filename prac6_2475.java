package bronze5;

import java.util.Scanner;

public class prac6_2475 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		int result = 0;

		for(int i=0; i<input.length(); i++)
		{
			char temp = input.charAt(i);
			
			if(temp!=' ')
			{
				result += (temp - '0') * (temp - '0');
			}
		}
		
		System.out.println(result%10);
	}
}