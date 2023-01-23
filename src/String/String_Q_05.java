package String;

public class String_Q_05 {
    public static void main(String[] args) {
        //Add to strings together, if the last character of the first string is the same
       // with the first character of the second string remove on the characters

        String s1="Hello World";

        String s2="diyarbakır";

        String s3="";

        if(s1.charAt(s1.length()-1)==s2.charAt(0))
        {
             s3=s1.concat(s2.substring(1));
        }else s1.concat(s2);

        System.out.println("s3 = " + s3);


        //2.yol

        StringBuilder stringBuilder=new StringBuilder(s1);
        if(stringBuilder.charAt(stringBuilder.length()-1)==s2.charAt(0))
        {
         stringBuilder.deleteCharAt(stringBuilder.length()-1).append(s2);
        } else stringBuilder.append(s2);
        System.out.println("stringBuilder = " + stringBuilder);

        //Stringbuilder ile stringbuffer arasındaki fark?
        //Stringbuffer parallel testte iki farklı thread de kullanılabiliyor. Stringbuilder kullanılabiliyor...
        //builder buffera göre daha hızlı ama parallel testte kullanılırken sorun çıkarabiliyor





    }
}
