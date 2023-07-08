import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Interferencias {
    private static int MaxInterference(int[] interferences , int lo, int hi) // En este bloque de codigo se busca el pivote que se pondra en medio.
    {
        if(lo == hi)
        {
            return interferences[lo];
        }

        int partition = (lo + hi)/2;

        int mitadIzq = MaxInterference(interferences, lo, partition);
        int mitadDer = MaxInterference(interferences, partition + 1, hi);

        int maxIntComp = Integer.MIN_VALUE; // max interferencia de izquerda a derecha

        int sumaInterfereces = 0;
        for(int i = partition; i >= lo; i--)
        {
            sumaInterfereces += interferences[i];
            if(sumaInterfereces > maxIntComp)
            {
                maxIntComp = sumaInterfereces;
            }
        }

        int maxIntComp2 = Integer.MIN_VALUE;
        sumaInterfereces = 0;
        for(int i = partition; i<= hi ; i++)
        {
            sumaInterfereces += interferences[i];
            if(sumaInterfereces>maxIntComp2);
            {
                maxIntComp2 = sumaInterfereces;
            }
        }

        int maxIntCont3 = Math.max(maxIntComp, maxIntComp2);
        maxIntCont3 = Math.max(maxIntCont3, maxIntComp + maxIntComp2);

        return maxIntCont3;
    }

    public static int MaxInt(int[] interferences)
    {
        return MaxInterference(interferences, 0, interferences.length-1);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] interferences = new int[N];
        for(int i = 0 ; i < N ; i++)
        {
            interferences[i] = sc.nextInt();
        }
        int f = Interferencias.MaxInterference(interferences, 0, interferences.length-1);
        System.out.println(f);
    }
}
