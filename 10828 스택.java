https://yoloaeee.tistory.com/142

==============================================================================

package prac;

import java.util.Scanner;

public class Main
{
     // stack 클래스
     static class stack
     {
         // stack에 사용하는 노드 클래스
          static class node
         {
               // 앞, 뒤 노드를 가리키는 포인터 변수와 value 변수
               node prev;
               node next;
               int value;

               node(int v)
               {
                    this.value = v;
               }
               node(node p, node n, int v)
               {
                    this.prev = p;
                    this.next = n;
                    this.value = v;
               }
         }

         private node top;  // stack의 꼭대기
         private int size = 0; // stack의 크기

         // stack에 새로운 노드를 삽입
         public void push(int x)
         {
              node newnode = new node(x);

              if(empty()==1)
              {
                   top = newnode;
              }
              else
              {
                   top.next = newnode;
                   newnode.prev = top;
                   top = newnode;
              }

              size++;
         }
         // stack의 맨 위에 있는 노드를 삭제하고 삭제한 노드의 값을 리턴
         public int pop()
         {
              if(empty()==1) 
              {
                   return -1;
              }
              else
              {
                   int temp = this.top.value;
                   size--;

                   if(size==0)
                   {
                        top = null;
                   }
                   else
                   {
                        top = top.prev;
                        top.next = null;
                   }

                   return temp;
              }
         }
         // stack의 top이 가리키는 노드의 값을 출력(비어있으면 -1 출력)
         public int top()
         {
              return this.empty()==1?-1:this.top.value;
         }
         // 현재 stack의 크기를 리턴
         public int size()
         {
                 return size;
         }
         // stack이 비어있으면 1, 값이 있으면 0을 출력
         public int empty()
         {
                 return this.size==0?1:0;
         }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        stack s = new stack();
        StringBuilder sb = new StringBuilder();
    
        int n = sc.nextInt();
    
        for(int i=0; i<n; i++)
        {
                String input = sc.next();
    
                // 입력받는 명령어에 따라 구현
                if(input.equals("top"))
                {
                     sb.append(s.top());
                     sb.append("\n");
                }
                else if(input.equals("size"))
                {
                     sb.append(s.size());
                     sb.append("\n");
                }
                else if(input.equals("empty"))
                {
                     sb.append(s.empty());
                     sb.append("\n");
                }
                else if(input.equals("pop"))
                {
                     sb.append(s.pop());
                     sb.append("\n");
                }
                else // stack에 push할 경우에는 출력 X
                {
                     String temp = sc.next();
                     s.push(Integer.parseInt(temp + ""));
                }    
        }
    
        System.out.println(sb.toString());
        sc.close();
    }
}
