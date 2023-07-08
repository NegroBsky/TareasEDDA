import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheRealmOfBinaria
{
    public static int calculo(int[][] matriz, int fila, int suma)
    {
        if(fila == matriz.length)
        {
            return suma;
        }
        int maxSum = 0;
        for(int i = 0 ; i<matriz.length; i++)
        {
            int[][]matrixCopiada = copiarMatrix(matriz);
            for(int j = 0 ; j < matriz.length; i++)
            {
                matrixCopiada = 1 - matrixCopiada[i][j];
            }
            int sumaFila = ValorSumaFila(matrixCopiada, fila);
            int nuevaSum = suma + sumaFila;

            int sumRec = calculo(matrixCopiada, fila+1, nuevaSum );
            maxSum = Math.max(maxSum, sumRec);
        }
        return maxSum;
    }

    public static int copiarMatrix(int[][] matriz)
    {
        int [][] copia = new int[matriz.length][matriz[0].length];
        for(int i = 0 ; i<matriz.length; i++)
        {
            for(int j = 0 ; j<matriz[0].length; j++)
            {
                copia[i][j] = matriz[i][j];
            }
        }
        return copia;
    }
    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] matriz = new int[N][M];

        for(int i = 0 ; i< N ; i++)
        {
            for(int j = 0 ; i<M ; i++)
            {
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.print(calculo(matriz, 0, 0));
    }
}