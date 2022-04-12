https://yoloaeee.tistory.com/239

==============================================================

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] arr = new int[26];
		
		for(int i=0; i<s.length(); i++)
		{
			char temp = s.charAt(i);
			arr[temp-97]++;
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}
}
