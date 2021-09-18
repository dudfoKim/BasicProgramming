https://yoloaeee.tistory.com/105

============================================================
 
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    // 종료 조건 확인
    public static boolean isZero(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]!=0)
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] value = new int[] {-1,-1,-1};

        while(true)
        {
            value[0] = sc.nextInt();
            value[1] = sc.nextInt();
            value[2] = sc.nextInt();

            // 0, 0, 0이 입력으로 들어오면 종료
            if(isZero(value))
            {
                break;
            }

            // 최대 변의 길이(빗변)을 value[2]로 설정
            Arrays.sort(value);

            if(Math.sqrt(Math.pow(value[0], 2)+Math.pow(value[1], 2))
                        !=Math.sqrt(Math.pow(value[2], 2)))
            {
                System.out.println("wrong");
            }
            else
            {
                System.out.println("right");
            }
        }
    }
}
