import java.util.Scanner;
public class myclass {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.print("String :");
        String line = var.nextLine();
        System.out.println(line.trim());
        
        if(line.startsWith("name"))
        System.out.println("The string starts with name");

        if(line.endsWith("name"))
        System.out.println("THe string ends with name");
        System.out.print("Integer :");
        int firstInt = var.nextInt();
        System.out.print("Double :");
        double firstDouble = var.nextDouble();

        System.out.println(firstInt);
        System.out.println(firstDouble);
    }       

}