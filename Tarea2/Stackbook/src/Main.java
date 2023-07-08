import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class sort
{
    public static void Traspasar(Stack<Integer> Pila)
    {
        Stack<Integer> SortedPila = new Stack<Integer>();
        Queue<Integer> aux = new LinkedList<Integer>();

        while(SortedPila.size()<Pila.size())
        {
            int mayor = 0;

            while(!Pila.isEmpty())
            {
                int valor = Pila.pop();
                if(valor>mayor)
                {
                    mayor = valor;
                }
            }
            while(!aux.isEmpty())
            {
                Pila.push(aux.remove());

            }
        }

        for(int val : Pila )
        {
            System.out.print(val + " ");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();

        System.out.println("tam de pila");
        int sizePila = scan.nextInt();


        for(int i = 0 ; i < sizePila ; i++)
        {
            System.out.println("Ingresa datos");
            int p = scan.nextInt();
            pila.push(p);
        }

        sort.Traspasar(pila);

    }
}