import org.w3c.dom.Node;
import java.util.*;
import java.util.stream.Collectors;

class result
{
    public static void sort(Queue<Integer>Hablidades1 , Queue<Integer> Habilidades2)
    {
        Queue<Integer> Fusion = new LinkedList<>();

      while(!Hablidades1.isEmpty() && !Habilidades2.isEmpty())
        {
            if (Hablidades1.peek()<Habilidades2.peek())
            {
                Fusion.offer(Hablidades1.poll());
            }
            else
            {
                Fusion.offer(Habilidades2.poll());
            }
        }

        while(!Hablidades1.isEmpty())
        {
            Fusion.offer(Hablidades1.poll());
        }

        while(!Habilidades2.isEmpty())
        {
            Fusion.offer(Habilidades2.poll());
        }

        while (!Fusion.isEmpty())
        {
            System.out.print(Fusion.poll() + " ");
        }

        /**
         Fusion.addAll(Hablidades1);
        Fusion.addAll(Habilidades2);

        ArrayList<Integer> Fusion2 = new ArrayList<>(Fusion1);
        Collections.sort(Fusion2);

        //Queue<Integer> SortedFusion = new LinkedList<>(Fusion2);

        for(int val : Fusion)
        {
            System.out.print(val + " ");
        }
         */
    }
}
public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);

        // Ingreso Habilidades personaje 1
        Queue<Integer> Habilidades1 = new LinkedList<>();
        int SizeP1 = scan.nextInt();
        if(SizeP1 < 0 || SizeP1 > Math.pow(10, 6))
        {
            System.out.println("Exede maximo o minimo");
        }
        else
        {

            for(int i = 0 ; i<SizeP1 ; i++)
            {
                System.out.println("Habilidad p1");
                int H1 = scan.nextInt();
                Habilidades1.offer(H1);
            }
        }
        //Ingreso Habilidades personaje 2
        Queue<Integer> Habilidades2 = new LinkedList<>();
        int SizeP2 = scan.nextInt();
        if(SizeP1 < 0 || SizeP1 > Math.pow(10, 6))
        {
            System.out.println("Exede maximo o minimo");
        }
        else
        {

            for(int i = 0 ; i<SizeP2 ; i++)
            {
                System.out.println("Habilidad p2");
                int H2 = scan.nextInt();
                Habilidades2.offer(H2);
            }

        }
        //Sort e imporimir
        result.sort(Habilidades1,Habilidades2);
    }
}