package Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Array_Q02 {
    public static void main(String[] args) {
        // Find the greatest difference between values in an int array

        int [] array={8,9,5,3,4,7,30};
        System.out.println("maxDifference(array) = " + maxDifference(array));
        System.out.println(maxDifferenceSecond(array));
        System.out.println(maxDifferenceStream(array));
        System.out.println(maxDifferent(array));
    }
    
    
    public static int maxDifference (int []array)
    {
        return IntStream.of(array).max().getAsInt()-IntStream.of(array).min().getAsInt();

    }

    public static int maxDifferenceSecond (int []array) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }


        }
        return max - min;
    }

    public static int maxDifferenceStream (int []array)
    {
        return Arrays.stream(array).max().getAsInt()- Arrays.stream(array).min().getAsInt();

    }



    public static int maxDifferent (int [] array)
    {
        int diff =0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (Math.abs(array[i]-array[j])>diff)
                    diff=Math.abs(array[i]-array[j]);

            }

        }
        return diff;
    }

    }

