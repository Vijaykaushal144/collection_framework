import java.util.LinkedList;
import java.util.Queue;

public class linklist_Quee {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.offer(3);
        q.offer(5);
        q.offer(6);
        q.offer(8);
        //add()=if an element did not add successfully then it throws exception.
        System.out.println(q);

        System.out.println(q.poll());//it remove the element and return that element also. output--3
        //remove()= if quee is empty then it throws exception.
        System.out.println(q);//[5,6,8]

        System.out.println(q.peek());//which  next element will  remove. output--   5.
        //element()=if quee is empty then it  throws exception.




    }
}
