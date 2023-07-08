import java.util.Scanner;

public class DesafiandoLosLimites
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Alto de la matriz.
        int M = sc.nextInt(); // Ancho de la matriz.

        int[][] matriz = new int [N][M];
        for(int i = 0 ; i<N ; i++) // llenamos la matriz
        {
            for(int j = 0 ; j<M ; j++)
            {
                matriz[i][j] = sc.nextInt();
            }
        }
        int maxArea = 0;
        boolean[][] visited = new boolean[N][M];

        for(int i = 0 ; i<N ; i++)//se recorre la matriz en busca de la mayor cantidad de 1 juntos
        {
            for(int j = 0 ; j<M ; j++)
            {
                if(matriz[i][j] == 1)
                {
                    int size = DFS(matriz,visited, i, j);
                    maxArea = Math.max(maxArea, size);
                }
            }
        }
        System.out.print(maxArea);
    }
    private static int DFS(int[][] matriz,boolean[][] visited ,int fila, int columna)
    {
        if(fila < 0 || fila >= matriz.length || columna < 0 ||columna >= matriz[0].length || matriz[fila][columna] != 1 || visited[fila][columna]) // condiciones
        {
            return 0;
        }

        visited[fila][columna] = true;
        int size = 1;

        size += DFS(matriz,visited, fila - 1, columna); //arriba
        size += DFS(matriz,visited, fila + 1, columna); // abajo
        size += DFS(matriz,visited, fila, columna -1 ); // izquierda
        size += DFS(matriz,visited, fila, columna + 1); // derecha
        return size;
    }
}
