package Array;

public class Array_Q_05 {
    public static void main(String[] args) {
        //Find the min and max values in a multidimensional array

        int [][] x={{4,5,6}, {14,1,56}, {45,3,222}};

        int min=x[0][0];
        int max=x[0][0];


        for (int i = 0; i <x.length ; i++) {
            for (int j = 0; j <x[i].length ; j++) {
                if(x[i][j]<min) min=x[i][j];
                if(x[i][j]>max) max=x[i][j];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        // FOREACH ILE

        for (int[] ints : x) {
            for (int anInt : ints) {
                if (anInt < min) min = anInt;
                if (anInt > max) max = anInt;
            }
        }
    }
}
