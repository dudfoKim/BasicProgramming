package b4_20210321;

import java.util.*;

public class b4_4299 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int add = sc.nextInt();
		int minus = sc.nextInt();
		boolean check = false;
		
		for(int i=0; i<=add; i++)
		{
			if(2*i-minus==add)
			{
				System.out.println(i + " " + (i-minus));
				check = true;
				break;
			}
		}
		
		if(!check)
		{
			System.out.println(-1);
		}
	}
}