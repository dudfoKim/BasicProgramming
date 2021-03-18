package bronze5;

import java.math.*;
import java.util.*;

public class prac3_1271
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		BigInteger a, b;
		
		a = sc.nextBigInteger();
		b = sc.nextBigInteger();

		System.out.println(a.divide(b));
		System.out.println(a.mod(b));
	}

}