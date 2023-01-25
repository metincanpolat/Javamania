package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_Q_03 {
    public static void main(String[] args) {

        // compare same indexes of 2 different arrays and create another array for mathching values
        // Aynı indexteki elemanları yeni arraye atma

        int [] x={4,5,6,7,8,9};
        int[] y={0,1,6,3,8,10,4};

        int xLength=x.length;
        int yLength=y.length;

        int zLength;

       //zLength= Math.min(xLength, yLength);

       zLength= (xLength>=yLength)?yLength:xLength;  //minimum olanı bulduk

       ArrayList<Integer>newArray=new ArrayList<>();

        for (int i = 0; i <zLength ; i++) {
            if (x[i]==y[i]){
                newArray.add(x[i]);
            }
        }
        System.out.println(newArray);




        //Farklı indexler için ortak sayıları bulma

        ArrayList<Integer>newArray2=new ArrayList<>();

        for (int i = 0; i <zLength ; i++) {
            for (int j = 0; j < yLength; j++) {
                if(x[i]==y[j])
                    newArray2.add(x[i]);
            }
        }
        System.out.println(newArray2);
    }
}
