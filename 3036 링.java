import java.util.Scanner;

public class Main
{
    public static int gcd(int a, int b)
    {
        while(b!=0)
        {
        	int temp = b;
            b = a%b;
            a = temp;
        }
        
        return a;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 총 입력숫자 갯수
        int gijun = sc.nextInt(); // 기준 숫자
        
        for(int i=1; i<n; i++)
        {
        	int value = sc.nextInt();
            int gcd = gcd(gijun, value); // 최대공약수 구하기
            
            System.out.println((gijun/gcd) + "/" + (value/gcd));
        }
    }
}
