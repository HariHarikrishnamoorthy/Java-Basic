import java.util.*;
import java.math.*;
import java.text.NumberFormat;
public class variables {
    public static void main(String[] args) {
        
        //////////////////////byte < short < int < long 
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4;
        System.out.print(a+" ");
        System.out.print(b+" ");
        System.out.print(c+" ");
        System.out.println(d);

        ///////////////////////float < double 

        float A = 1.1F;
        double B = 3.14F;

        System.out.print(A+" ");
        System.out.println(B);

        /////////////////////Strings  to  numbers

        String sint = "123";
        String Sdouble = "3.14";

        System.out.println(Integer.parseInt(sint));
        System.out.println(Double.parseDouble(Sdouble));

        //////////////////////main methords

        int rnd = Math.round(1.333F);
        double ceil = Math.ceil(1.345667);
        int max = Math.max(2,3);

        System.out.println(rnd);
        System.out.println(ceil);
        System.out.println(max);
        System.out.println(Math.round(Math.random()*1000));


        ////////////////////Number formating 
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String dollor = currency.format(11111111.222);
        System.out.println(dollor);

        String percent = NumberFormat.getPercentInstance().format(100/50);
        System.out.println(percent);

    }
}