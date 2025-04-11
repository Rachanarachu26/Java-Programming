package Arrays_example;

import java.util.Scanner;

public class Transpose_Of_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and columns: ");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] matrix=new int[rows][cols];
        System.out.println("Enter matrix elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();

            }
        }

        //transpose of matrix

        for(int j=0;j<cols;j++){
            for(int i=0;i<rows;i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
