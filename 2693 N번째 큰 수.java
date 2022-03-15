https://yoloaeee.tistory.com/221


=====================================

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++)
        {
            ArrayList<Integer> list = new ArrayList<Integer>();
            
            for(int j=0; j<10; j++)
            {
                list.add(sc.nextInt());
            }
            
            Collections.sort(list);
            System.out.println(list.get(7));
        }
        
        sc.close();
    }
}

 
