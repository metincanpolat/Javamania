package String;

import java.util.Arrays;

public class String_Q_01 {
    public static void main(String[] args) {

        // 1. Reverse a string without using predefined reverse methods.

        String word = "Javamania";
//        /*1.Yöntem*/
//        String newWord = "";
//
//        for (int i = word.length()-1; i >=0 ; i--) {
//            newWord += word.charAt(i);
//        }
//        System.out.println("newWord = " + newWord);

        /*2.Yöntem*/
//        StringBuilder newWord = new StringBuilder();
//
//        for (int i = word.length()-1; i >=0 ; i--) {
//            newWord.append(word.charAt(i));
//        }
//        System.out.println("newWord = " + newWord);

        /*3.Yöntem*/

        String[] newList = word.split("");

        System.out.println("newList = " + Arrays.toString(newList));

        String newWord  = "";
        for (int i = newList.length-1; i >= 0 ; i--) {
            newWord += newList[i];

        }
        System.out.println("newWord = " + newWord);






    }
}
