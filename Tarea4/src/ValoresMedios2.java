import java.io.*;
import java.sql.SQLOutput;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class ValoresMedios2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue<>();

        for(int i = 0 ; i<N ; i++)
        {
            int n = sc.nextInt();

            if(max.isEmpty() || n < max.peek())
            {
                max.offer(n);
            }
            else
            {
                min.offer(n);
            }

            if(max.size() - min.size() >1)
            {
                min.offer(max.poll());
            }
            else if(min.size() - max.size()>0)
            {
                max.offer(min.poll());
            }

           System.out.println(max + "," + min);

            if (min.size() == max.size()) {
                System.out.println(max.peek() + "," + min.peek());
            } else {
                System.out.println(max.peek());
            }
        }
    }
}
