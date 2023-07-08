import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EmbecesLaVidaDaVueltas {
    private static int Vuelta(int[] array)
    {
        int costoFinal = 0; // O(1)
        int N = array.length;//O(1)
        for (int i = 0 ; i< N - 1 ; i++)
        {
            int indiceMinimo = i;
            for (int j = i+1; j< N ; j++)
            {
                if(array[j] < array[indiceMinimo])
                {
                    indiceMinimo = j;
                }
            }
            int costo = indiceMinimo - i + 1;
            costoFinal += costo;

        }
        return costoFinal;

       /* for (int k : array) { //  O(n)
            if (k < minimo) {
                minimo = k;
            }
        }
        for (int k : array) { //  O(n)
            costo = k - minimo;
        }
        */

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int [] Array = new int[N];

        for(int i = 0 ; i<N ; i++)
        {
            Array[i] = sc.nextInt();
        }
        System.out.println(Vuelta(Array));
    }
}