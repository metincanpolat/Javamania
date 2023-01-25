package Array;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array_Q_04 {
    public static void main(String[] args) {
        // sort an array with ascending and descending order  (with method)

        int []x={5,8,9,12,1,23};

        System.out.println(ascending(x));
        System.out.println(descending(x));

    }

    public static ArrayList<Integer> ascending(int [] x)

    {

        ArrayList<Integer> asc=new ArrayList<>();

        for (int a: x ) {
            asc.add(a);
        }
        Collections.sort(asc);

    return asc;
    }


    public static ArrayList<Integer>  descending (int [] x)
    {

        ArrayList<Integer> desc=new ArrayList<>();

        for (  int b :x   ) {
            desc.add(b);
               }

        //desc.sort(Collections.reverseOrder());

        Collections.sort(desc, Collections.reverseOrder());
        return desc;
    }
}
