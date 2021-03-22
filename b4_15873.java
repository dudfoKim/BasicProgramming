package b4_20210322;

import java.util.Scanner;

public class b4_15873
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int a = 0;
		int b = 0;
		int i = 0;
		int length = input.length();
		
		if(length==2)
		{
			a = input.charAt(0) - '0';
			b = input.charAt(1) - '0';
            System.out.println(a+b);
		}
		else if(length==4)
		{
			System.out.println(20);
		}
		else
		{
			if(input.charAt(1) - '0' == 0)
			{
				System.out.println(10 + input.charAt(2)-'0');
			}
			else if(input.charAt(2) - '0' == 0)
			{
				System.out.println(10 + input.charAt(0)-'0');
			}
		}
	}
}