import java.util.ArrayDeque;

public class Array_deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.offer(23);
        ad.addFirst(21);
        ad.addLast(78);
        ad.offer(67);
        System.out.println(ad);

        System.out.println(ad.peek());
        System.out.println("Firstpeek   " + ad.peekFirst());
        System.out.println("Last    " + ad.peekLast());


        System.out.println(ad.poll());
        System.out.println(ad);
        System.out.println("Fristpoll   " + ad.pollFirst());
        System.out.println("Last    "  + ad.pollLast());
        System.out.println("pop  " + ad.pop());
        System.out.println(ad);
    }
}
