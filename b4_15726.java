package b4_20210322;

import java.util.Scanner;

public class b4_15726
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
        double temp1 = (a*b)/c;
        double temp2 = (a/b)*c;
        
        System.out.println(temp1>temp2?(int)temp1:(int)temp2);
	}
}