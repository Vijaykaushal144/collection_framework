import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        //custome hash set;
        Set<Student> st=new HashSet<>();
        st.add(new Student("vijay",1));
        st.add(new Student("Rafel",2));
        st.add(new Student("shyam",3));
        st.add(new Student("vijay",1));
        System.out.println(st);
//       Set<Integer> st=new HashSet<>();
//       st.add(45);
//       st.add(67);
//       st.add(89);
//       st.add(12);
//       st.add(23);
//       System.out.println(st);
//        System.out.println(st.contains(24));
//        System.out.println(st.isEmpty());
//        System.out.println(st.size());
//        st.clear();
//        System.out.println(st);
//        Set<Integer> st=new LinkedHashSet<>();
//        st.add(45);
//        st.add(67);
//        st.add(89);
//        st.add(12);
//        st.add(23);
//        System.out.println(st);
//        System.out.println(st.contains(24));
//        System.out.println(st.isEmpty());
//        System.out.println(st.size());
//        st.clear();
//        System.out.println(st);

    }
}
