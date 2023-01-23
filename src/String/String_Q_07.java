package String;

public class String_Q_07 {
    public static void main(String[] args) {
        //Write a Java Program to find whether a String is palindrome or not.

// Tersi kendisine eşit olan bir string mi değil mi?

        String s="TEKET";

        String reverse="";

        for (int i = s.length()-1; i>=0 ; i--) {
            reverse+=""+s.charAt(i);
        }
        if(s.equals(reverse))
            System.out.println(true);
                    else System.out.println(false);;

    }




}
