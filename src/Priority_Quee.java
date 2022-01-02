import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority_Quee {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1=new PriorityQueue<>(Comparator.reverseOrder());
        pq1.offer(90);
        pq1.offer(34);
        pq1.offer(12);
        pq1.offer(78);
        System.out.println(pq1);//there minheap is applicable. so smaller no. have first priority.
        System.out.println(pq1.poll());//it removes high priority number.
       System.out.println(pq1.peek());//it gives high priority number.


    }
}
