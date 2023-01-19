package String;

import java.util.Arrays;

public class Q_02 {
    public static void main(String[] args) {

        // Count number of Vowels & Consonants

        String cumle = "Merhaba Biz Javamania";
        cumle = cumle.replaceAll(" ","").toLowerCase();
        System.out.println("cumle = " + cumle);

        char[] sesliHarf = {'a','e','i','ı','o','ö','u','ü'};

        int vowels=0;

        for (int i = 0; i < cumle.length() ; i++) {
            int b = Arrays.binarySearch(sesliHarf, cumle.charAt(i));
            if (b>-1)
                vowels++;
        }
        int consonants = cumle.length()-vowels;
        System.out.println("vowels = " + vowels);
        System.out.println("consonants = " + consonants);






    }
}
