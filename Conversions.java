import java.util.*;
public class Conversions {
    public static void main(String[] args) {
        String s1 = "911";
        int firstint = Integer.parseInt(s1);
        String s2 = "133.34";
        double firstdouble = Double.parseDouble(s2);

        System.out.println("\n\nString to Numbers");
        System.out.println(firstint);
        System.out.println(firstdouble);
        System.out.printf("\n\n\nOther Convertion methods");

        System.out.println("\nint to string");
        System.out.println(String.valueOf(911));
        System.out.println(Integer.toString(911));

        System.out.println("\nString to long");
        System.out.println(Long.parseLong("911"));

        System.out.println("\nlong to String");
        System.out.println(String.valueOf(911));
        System.out.println(Long.toString(911));

        System.out.println("\nString to float");
        System.out.println(Float.parseFloat("91.1"));

        System.out.println("\nfloat to String");
        System.out.println(String.valueOf(9.11));
        System.out.println(Float.toString((float) 9.11));

        System.out.println("\nString to double");
        System.out.println(Double.parseDouble("911"));

        System.out.println("\ndouble to String");
        System.out.println(String.valueOf(123.90));
        System.out.println(Double.toString(123.45));
    }
}
