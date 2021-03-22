package b4_20210322;

import java.util.Scanner;

public class b4_20499 
{

	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] kda = input.split("/");
        int death = Integer.parseInt(kda[1]);
        
        if((death==0) || (Integer.parseInt(kda[0])+Integer.parseInt(kda[2])<death))
        {
            System.out.println("hasu");
        }
        else
        {
            System.out.println("gosu");
        }
    }
}