import java.util.LinkedList;
import java.util.ListIterator;

public class List {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add("c");
        l.add("cpp");
        l.add("java");

        ListIterator lit=l.listIterator();
        while(lit.hasNext())
        {
            String s= (String)lit.next();
            if(s.equals("java"))
            {
                lit.set("java se");
            }
            else if (s.equals("c"))
            {
                lit.add("ds");
            }
            else if(s.equals("cpp"))
            {
                lit.remove();
            }
        }
        System.out.println(l);
    }
}
