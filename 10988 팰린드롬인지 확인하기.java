https://yoloaeee.tistory.com/223

==================================


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int chk = 1;
        
        for(int i=0; i<input.length()/2; i++)
        {
            if(input.charAt(i)!=input.charAt(input.length()-1-i))
            {
                System.out.println(0);
                return;
            }
        }
        
        System.out.println(1);
        sc.close();
    }
}
