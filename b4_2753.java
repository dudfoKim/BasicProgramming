package b4_20210322;

import java.util.*;

public class b4_2753 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int time = sc.nextInt();
		
		minute += time;
		
		if(minute>=60)
		{
			hour += (int)(minute/60);
			minute %= 60;
		}
		if(hour>=24)
		{
			hour %= 24;
		}
		
		System.out.println(hour + " " + minute);
		
	}
}