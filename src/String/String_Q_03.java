package String;

public class String_Q_03 {
    public static void main(String[] args) {

        // Count how many b letter in a given String

        String s="hajsla hshBvs bAksbJj sbJSBnlBgbfb";
       // s= s.toLowerCase();
        int count=0;

        for ( char c  : s.toCharArray()) {
            if (c=='b'){
                count++;
            }

        }
        System.out.println("count = " + count);



        //2.yol

        s=s.trim().replaceAll(" ", "");
        int length1=s.length();

        s=s.replaceAll("b","");
        int length2=s.length();

        int b=length1-length2;

        System.out.println("b = " + b);


    }
}
