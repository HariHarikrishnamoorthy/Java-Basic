package JavaTutorail2;

public class Recution1 {
    public static void main(String[] args) {
        long n = 25;
        System.out.println("Factorial of " + n + " is " + fact(n));
    }
    public static long fact(long n){
        if (n == 1)
            return 1;
        else    
            return n * fact(n - 1);
    }

}