https://yoloaeee.tistory.com/139

================================================================

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main
{
     // 회원정보 클래스
     static class member
     {
         int index;
         int age;
        String name;

         member(int index, int age, String name)
         {
             this.index = index;
             this.age = age;
            this.name = name;
     }
}

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<member> list = new ArrayList<member>();
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++)
        {
         // 입력받는 좌표데이터를 리스트에 add
         list.add(new member((i+1), sc.nextInt(), sc.next()));
        }
        
        // 정렬 실행
        Collections.sort(list, new Comparator<member>()
        {
             @Override
             public int compare(member o1, member o2)
             {
                  // 나이 오름차순으로 정렬
                  if(o1.age!=o2.age)
                  {
                       return o1.age>o2.age?1:-1;
                  }
                  // 나이가 같으면 인덱스(가입한 순서)로 정렬
                  else
                  {
                       return o1.index>o2.index?1:-1;
                  }
             }
        });
        
        for(member data : list)
        {
         System.out.println(data.age + " " + data.name);
        }
    }
}
