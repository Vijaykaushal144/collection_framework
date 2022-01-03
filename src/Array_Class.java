import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_Class {
    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6,7,8,9};
//        int index= Arrays.binarySearch(arr,4);// it will applicable only for sorted arrray.
//        System.out.println(index);

        Integer[] arr={23,45,31,6,76,45,2,1,86};
        Arrays.sort(arr);
        Arrays.fill(arr, 23);// output 23  23  23  23  23  23  23  23  23
        for(int i:arr)
        {
            System.out.print(i+ "  ");
        }
    }
}
