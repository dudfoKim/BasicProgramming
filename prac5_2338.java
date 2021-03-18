package bronze5;

import java.util.Scanner;
import java.math.*;

public class prac5_2338 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		BigDecimal a = sc.nextBigDecimal();
		BigDecimal b = sc.nextBigDecimal();
		
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
	}
}