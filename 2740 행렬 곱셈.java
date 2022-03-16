

==================================

import java.util.Scanner;

 

public class Main

{

    public static void main(String[] args)

    {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();

        int[][] a = new int[n][m];

        

        // 행렬 A 입력값 받기 (N*M)

        for(int i=0; i<n; i++)

        {

            for(int j=0; j<m; j++)

            {

                a[i][j] = sc.nextInt();

            }

        }

        

        // 행렬 B 입력값 받기 (M*K)

        m = sc.nextInt();

        int k = sc.nextInt();

        int[][] b = new int[m][k];

        

        for(int i=0; i<m; i++)

        {

            for(int j=0; j<k; j++)

            {

                b[i][j] = sc.nextInt();

            }

        }

        

        int[][] result = new int[n][k];

        

        // 행렬 곱 실행 (N*K)

        for(int x=0; x<n; x++)

        {

            for(int z=0; z<k; z++)

            {

                int temp = 0;

                

                for(int y=0; y<m; y++)

                {

                    temp += (a[x][y]*b[y][z]);

                }

                

                result[x][z] = temp;

            }

        }

        

        // 결과값 출력

        for(int i=0; i<n; i++)

        {

            for(int j=0; j<k; j++)

            {

                System.out.print(result[i][j] + " ");

            }

            

            System.out.println();

        }

        

        sc.close();

    }

}

