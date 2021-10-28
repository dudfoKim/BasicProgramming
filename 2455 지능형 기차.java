https://yoloaeee.tistory.com/154

==================================

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] people = new int[4];
        int now = 0;
        
        for(int i=0; i<4; i++)
        {
            now -= sc.nextInt();
            now += sc.nextInt();
            people[i] = now;
        }
        
        Arrays.sort(people);
        System.out.println(people[people.length-1]);
        sc.close();
    }
}
