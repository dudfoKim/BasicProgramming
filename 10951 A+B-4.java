https://yoloaeee.tistory.com/80

==========================================

import java.util.*;

public class Main 
{
     public static void main(String[] args) 
     {
         Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextLine())
        {
            String input = sc.nextLine();
            String[] temp = input.split(" ");
            
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);
            
            System.out.println(a+b);
        }
        
         sc.close();
     }
}
