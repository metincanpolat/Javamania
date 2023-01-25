package Array;

import java.util.Arrays;

public class Array_Q_08 {
    public static void main(String[] args) {

        // FindingDuplicates

        int[] a={1, 3123, 5, -3, 13, 101, 50, 50, -131, 6, 191, 311, -500, 6, 19, -3, -5, 101, 191, 3123,1 };


        for(int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j])
                    System.out.println(a[j]);


//        Arrays.sort(a);
//
//        for (int i = 0; i <a.length-1 ; i++) {
//            if(a[i]==a[i+1])
//                System.out.println(a[i]);
            }

        }
    }
}

