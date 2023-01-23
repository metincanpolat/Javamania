package String;

public class String_Q_04 {
    public static void main(String[] args) {

        //Count the number of letters in a string and return true if it is even or false if it is odd

        String s="hajsla hshBvs AksbJj sbJSBnlBgbfb";

        s=s.replaceAll(" ", "");

        if(s.length()%2==0) System.out.println(true);
                else System.out.println(false);;

        System.out.println(s.length()%2==0);



    }
}
