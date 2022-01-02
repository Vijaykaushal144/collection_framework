import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        //Fisrt input first out(FIFO)
        Stack<String > st = new Stack<>();
        st.push("Varun");
        st.push("Riya");
        st.push("Shyam");
        st.pop();
        System.out.println(st);//varun, riya
        System.out.println( st.peek());//riya

    }
}
