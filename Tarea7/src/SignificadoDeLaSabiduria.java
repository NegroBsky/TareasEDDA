import java.io.*;
import java.util.*;

public class SignificadoDeLaSabiduria
{
    public static int calcular(List<Integer> Edades, int K)
    {
        Collections.sort(Edades);
        List<Integer> subLista = new ArrayList<>(Edades.subList(0, K));
        int valorInicial = subLista.get(0);
        int ultimoValor = subLista.get(subLista.size()-1);
        int suma = ultimoValor - valorInicial;
        return suma;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List <Integer> Edades = new ArrayList<>();

        for(int i = 0 ; i < N ; i++)
        {
            int n = sc.nextInt();
            Edades.add(n);
        }
        Collections.sort(Edades);
        System.out.println(calcular(Edades, K));
    }
}