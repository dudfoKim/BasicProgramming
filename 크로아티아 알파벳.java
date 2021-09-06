https://yoloaeee.tistory.com/m/84


===≈=========================


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String replace = "";
        
        input = input.replace("c=", "0");
        input = input.replace("c-", "1");
        input = input.replace("dz=", "2");
        input = input.replace("d-", "3");
        input = input.replace("lj", "4");
        input = input.replace("nj", "5");
        input = input.replace("s=", "6");
        input = input.replace("z=", "7");
        
        System.out.println(input.length());
    }
}
