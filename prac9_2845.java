package bronze5;

import java.util.*;

public class prac9_2845
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a, b, square;
		int[] paper = new int[5];
		
		a = sc.nextInt();
		b = sc.nextInt();
		square = a*b;
		
		for(int i=0; i<5; i++)
		{
			paper[i] = sc.nextInt();
			paper[i] = paper[i] - square;
			System.out.println(paper[i]);
		}
	}

}