package bronze5;

import java.util.Scanner;

public class prac4_1550 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String a = null;
		char temp;
		int result = 0;
		a = sc.next();

		for(int i=0; i<a.length(); i++)
		{
			temp = a.charAt(i);

			int jari = 1;
			
			for(int j=a.length()-i-1; j>0; j--)
			{
				jari *= 16;
			}

			if(temp=='A')
			{
				result = result + (jari*10);
			}
			if(temp=='B')
			{
				result = result + (jari*11);
			}
			if(temp=='C')
			{
				result = result + (jari*12);
			}
			if(temp=='D')
			{
				result = result + (jari*13);
			}
			if(temp=='E')
			{
				result = result + (jari*14);
			}
			if(temp=='F')
			{
				result = result + (jari*15);
			}
			if(temp-'0'<10)
			{
				result = result + (jari*(temp-'0'));
			}
		}
		
		System.out.println(result);
		
	}
}