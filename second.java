import java.util.Date;

import javax.lang.model.util.Elements.Origin;

public class Main{
    public static void main(String[] args) {
        String str =  "hi hello every one ";
    System.out.println(str.length());
    System.out.println(str.indexOf("h"));
    System.out.println(str.indexOf("one"));
    System.out.println(str.replace("hello", "Hello"));
    System.out.println(str.replaceFirst("every", "Every"));
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());
    System.out.println(str.trim());
    System.out.println(str);
    long a = 123_456_789_123_456_7891L;
    Date date = new Date(); 
    System.out.println(date);
    System.out.println(a);




    }
}