package b4_20210322;

import java.util.Scanner;

public class b4_2530 
{

	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int check = 0;
        
        if(year%4==0 && (year%100!=0 || year%400==0))
        {
            check = 1;
        }
        
        System.out.println(check==0?0:1);
    }
}