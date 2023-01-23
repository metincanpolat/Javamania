package String;

import java.util.HashMap;

public class String_Q_06 {
    public static void main(String[] args) {

        //Print the count of each character and the character itself in a given String
        // Bir stringdeki her karakterin kaç tane olduğunu bul.


        String s="Print the count of each character and the character itself in a given String";

        HashMap<Character, Integer> charCount=new HashMap<>();

        for (int i = 0; i <s.length()-1 ; i++) {
            if(charCount.containsKey(s.charAt(i)))
            {
            int count=charCount.get(s.charAt(i));
            charCount.put(s.charAt(i), ++count);

            }else {
                charCount.put(s.charAt(i), 1);

            }

        }
        System.out.println(charCount);

    }
}
