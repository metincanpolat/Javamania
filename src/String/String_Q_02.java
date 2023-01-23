package String;

import java.util.Arrays;

public class String_Q_02 {
    public static void main(String[] args) {

         // *Count number of Vowels & Consonants

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


    /* Çözüm 2 */

//        int countVowels=0;
//        int countConsonants=0;
//
//        String s="Number of Vowels and Consonants";
//        s=s.toLowerCase();
//        s=s.replaceAll(" ", "");
//
//        List<Character> v= Arrays.asList('a', 'e', 'i', 'o', 'u');
//
//        for (int i = 0; i < s.length(); i++) {
//            if(v.contains(s.charAt(i))) countVowels++;
//            else countConsonants++;
//
//        }
//
//        System.out.println(countVowels);
//        System.out.println(countConsonants);






    }
}
