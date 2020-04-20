/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Scanner; // import the Scanner module
/**
 *
 * @author Hari
 */
public class scanner{
    public static void main(String[] argu){
        Scanner objName = new Scanner(System.in); // creating a Scanner object.

        // Datatype varName = scannerObjectName.next()
        String name = objName.next();               //Syntax for scanning a String
        int age = objName.nextInt();               //Syntax for scanning int
        long phoneNumber = objName.nextLong();    //Syntax for scanning a Long
        double height = objName.nextDouble();    //Syntax for scanning a Double
        float weight = objName.nextFloat();     //Syntax for scanning a Float
        
        System.out.println("Name : " + name );
        System.out.println("Age : " + age);
        System.out.println("Phone Number : " +phoneNumber);
        System.out.println("Height : "+ height);
        System.out.println("Weight : " + weight);
    }
            
    
}
