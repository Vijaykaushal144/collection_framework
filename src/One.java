import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class One {
    public static void main(String[] args) {


        List<Integer> al= new ArrayList<>();
        al.add(45);
        al.add(46);
        al.add(7);
        al.set(2,23);
        //operation of each number====
        Iterator<Integer> it= al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        for (int i=0;i<al.size();i++)
        {
            System.out.println(2*al.get(i));
        }


        System.out.println(al);
        System.out.println(al);
        List<String> st=new ArrayList<>();
        st.add("Vijay");
        st.add("Kaushal");
        st.add("Ram");
        System.out.println(st);
        List<Integer> n=new ArrayList<>();
        n.add(4);
        n.add(46);
        n.add(2);
        al.clear();
        System.out.println(al);
        n.removeAll(al);//al=45 46 23 n=4 46 2
        n.addAll(al);
        System.out.println(n);
        System.out.println(al);

        stack===


    }
}
