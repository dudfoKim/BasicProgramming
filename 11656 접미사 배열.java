https://yoloaeee.tistory.com/207

===================================

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        String input = sc.nextLine();
        
        // 입력받은 문자열의 순서대로 접미사 리스트에 저장
        for(int i=0; i<input.length(); i++)
        {
            list.add(input.substring(i));
        }
        
        // 접미사를 정렬한 후 출력
        Collections.sort(list);
        
        for(String s : list)
        {
            System.out.println(s);
        }
        
        sc.close();
    }
}

