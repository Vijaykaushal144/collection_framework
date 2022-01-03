import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class map {
    public static void main(String[] args) {
        //HASH MAP
//        Map<String,Integer> m=new HashMap<>();
//        m.put("rafel",3);
//        m.put("Vipin",4);
//        m.put("Rawat",5);
//        m.put("one",1);
//        m.put("Two",2);
//        for (Map.Entry<String,Integer> e:m.entrySet())
//        {
//            System.out.println(e);
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
        //only print key set
//        for (String Key:m.keySet())
//        {
//            System.out.println(Key);
//        }
//        //only for values
//        for (Integer values:m.values())
//        {
//            System.out.println(values);
//        }

//        System.out.println(m.containsValue(3));
//        System.out.println(m.containsKey("Rawat"));

        Map<String,Integer> m=new TreeMap<>();
        m.put("Rafel",3);
        m.put("Vipin",4);
        m.put("Rawat",5);
        m.put("One",1);
        m.put("Two",2);
        //it will sort according to keys.
        System.out.println(m);
        System.out.println(m.isEmpty());

    }
}
