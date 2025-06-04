// addition and multiplication

import java.util.*;

class Main 
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int r1 = ob.nextInt();
        System.out.print("Enter number of columns: ");
        int c1 = ob.nextInt();

        int[][] A = new int[r1][c1];
        int[][] B = new int[r1][c1];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = ob.nextInt();
            }
        }
        
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                B[i][j] = ob.nextInt();
            }
        }
        
        System.out.println("Sum");
        int[][] sum = new int[r1][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                sum[i][j] += A[i][j] + B[i][j];
            }
        }
        System.out.println("Matrix Addition (A + B):");
        printMatrix(sum);
        //Multiplication
        
        if(c1 != r1)
        {
            System.out.println("Multiplication not possible ");
        }
        else 
        {
            int[][] product = new int[r1][c1];
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    for(int k=0;k<c1;k++)
                    {
                        product[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            System.out.println("Matrix Multiplication (A x B):");
            printMatrix(product);
        }
    }
    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
