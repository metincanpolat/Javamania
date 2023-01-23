package Array;

import java.util.stream.IntStream;

public class Array_Q_01 {
    public static void main(String[] args) {
        //Create a method which accepts Array and returns sum of all the elements in the array

        int[] array = {10, 11, 12, 13};

        System.out.println("total(array) = " + total(array));
        System.out.println("getTotal(array) = " + getTotal(array));

        System.out.println(IntStream.of(array).max());

    }

    public static int total(int[] array) {
        int total=0;
    for (int i=0; i<array.length; i++)
    {
        total+=array[i];
    }
        return total ;
    }




    public static int getTotal(int[]array)
    {
        return IntStream.of(array).sum();
    }

}
