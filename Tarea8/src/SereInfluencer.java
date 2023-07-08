import java.util.Scanner;
import java.io.*;
import java.util.*;
public class SereInfluencer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Dimensiones de la matriz
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] matrix = new int[N][M];

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < M ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int X = sc.nextInt(); // posicion horizontal
        int Y = sc.nextInt(); // posicion vertical
        int C = sc.nextInt(); // valor del post

        DFS(matrix,X ,Y ,matrix[X][Y],C);
        printMatrix(matrix);

    }
    private static void DFS(int[][] matrix, int X, int Y,int V ,int C){
        if(X < 0 || Y < 0 || X >= matrix.length || Y >= matrix[0].length){
            return;
        }
        if(matrix[X][Y] == V)
        {
            matrix[X][Y] = C;
            DFS(matrix, X + 1, Y, V, C);
            DFS(matrix, X - 1, Y, V, C);
            DFS(matrix, X, Y + 1, V, C);
            DFS(matrix, X, Y - 1, V, C);
        }
    }
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}