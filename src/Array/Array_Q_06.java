package Array;

import java.util.*;

public class Array_Q_06 {
    public static void main(String[] args) {

        //Eliminate duplicate values in an array

        int[] x={1, 1, 3, 8, 3, 5, 6, 5, 1, 8, 7};

        Set<Integer> set=new HashSet<>();

        for (int i : x) {
            set.add(i);
        }
        System.out.println(set);

    // 2.YOL

    int[] y={1, 1, 3, 8, 3, 5, 6, 5, 8, 7};
        Arrays.sort(y);
        System.out.println(Arrays.toString(y));

    ArrayList<Integer> list=new ArrayList<>();
        for (int j : y) {
            list.add(j);

        }

        for (int i = 0; i < list.size()-1 ; i++) {
        if (Objects.equals(list.get(i), list.get(i + 1))) list.remove(list.get(i));

    }
        System.out.println(list);

}

}
