package Array;

import sun.reflect.generics.tree.Tree;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Array_Q_07 {
    public static void main(String[] args) {

        //Find 2nd smallest number
        
        int[] a={1, 3123, 5, -3, 13, 101, 50, -131, 6, 191, 311, -500, -500, 6, 19, -3, -5 };

        //Tekrar eden değerlerden kurtulmak için SET e atıyoruz ilk önce

        Set<Integer> s=new TreeSet<>();
        for (int i : a)
            s.add(i);
        System.out.println(s);

        // SETTE INDEX OLMADIGI İÇİN OBJEYE CEVIRIYOR....

        Object[] a2=new Object[s.size()];
        s.toArray(a2);
        System.out.println(a2[1]);
    }

    }
