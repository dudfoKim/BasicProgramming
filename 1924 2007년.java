https://yoloaeee.tistory.com/247

===========================================
  
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] week = new String[]{"SUN","MON", "TUE", "WED", "THU", "FRI", "SAT"};
        String[] input = sc.nextLine().split(" ");
        int sum = 0;
        
        for(int i=1; i<Integer.parseInt(input[0]); i++) // 월별로 말일까지 더해주기
        {
            if(i==2)
            {
                sum += 28;
            }
            else if(i==4 || i==6 || i==9 || i==11)
            {
                sum += 30;
            }
            else
            {
                sum += 31;
            }
        }
        
        sum += Integer.parseInt(input[1]);
        sum %= 7;
        System.out.println(week[sum]);
        
        sc.close();
    }
}
