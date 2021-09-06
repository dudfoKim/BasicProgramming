https://yoloaeee.tistory.com/m/87

===≈=========================


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int sum = 0;
            
        for(int i=0; i<input.length(); i++)
        {
            char chk = input.charAt(i);
            int temp = chk - 65;
            temp /= 3;
            
            if(chk=='S' || chk=='V' || chk=='Y' || chk=='Z')
            {
                temp--;
            }
            
            temp += 3;
            sum += temp;
        }
        
        System.out.println(sum);
    }
}
