package b4_20210321;

import java.util.*;

public class b4_2588 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		int length = b.length();
		int temp = 0;
		int jari = 1;
		int one = 0;
		int result = 0;
		
		for(int i=a.length()-1; i>=0; i--)
		{
			one = one + ((a.charAt(i) -'0') * jari);
			jari *= 10;
		}
		
		jari = 1;
		
		for(int i=length-1; i>=0; i--)
		{
			temp = b.charAt(i) - '0';
			System.out.println(one*temp);
			result = result + (one*temp*jari);
			jari *= 10;
		}
		
		System.out.println(result);
	}
}