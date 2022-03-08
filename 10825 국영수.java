https://yoloaeee.tistory.com/218

===================================


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Main
{
    // ArrayList에 사용할 사용자 정의클래스 선언
    static class Student
    {
        String name;
        int korean;
        int english;
        int math;
        
        Student(String name, int korean, int english, int math)
        {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // 이름과 과목별 성적을 입력받아 ArrayList에 저장
        for(int i=0; i<n; i++)
        {
            list.add(new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        
        /* ArrayList 통째로 조건에 따른 정렬
        *  1. 국어 성적 비교(내림차순)
        *  2. 영어 성적 비교(오름차순)
        *  3. 수학 성적 비교(내림차순)
        *  4. 이름 비교(오름차순)
        */
        Collections.sort(list, new Comparator<Student>(){
           @Override
            public int compare(Student s1, Student s2)
            {
                if(s1.korean!=s2.korean)
                {
                    return s2.korean-s1.korean;
                }
                else
                {
                    if(s1.english!=s2.english)
                    {
                        return s1.english-s2.english;
                    }
                    else
                    {
                        if(s1.math!=s2.math)
                        {
                            return s2.math-s1.math;
                        }
                        else
                        {
                            return s1.name.compareTo(s2.name);
                        }
                    }
                }
            }
        });
        
        for(int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i).name);
        }
        
        sc.close();
    }
}
