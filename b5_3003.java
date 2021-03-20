package bronze5_20210319;

import java.util.Scanner;

public class b5_3003 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[6];
        int[] check = {1,1,2,2,2,8};
        
        for(int i=0; i<6; i++)
        {
            input[i] = sc.nextInt();
            System.out.println(check[i] - input[i]);
        }
    }
}