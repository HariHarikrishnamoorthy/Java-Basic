import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        Scanner    var  = new Scanner(System.in);
        int arrindex = 51 ;
        int[] arr = new int[arrindex];
        System.out.print("Numbers :");
            for(int i =0 ; i < arrindex ;i++){
                arr[i] = var.nextInt();
            }
        System.out.print("Number need to find : ");
        int num = var.nextInt();
        int a = arr.length;
        int loopcount =0;
        for(int i = 0 ; i < a ;)
        {
            int n = (i+a)/2;
            if(arr[n] == num)
            {
                System.out.println("found ........");
                System.out.println(arr[n]);
                System.out.println("It is in "+ n  +"th place");
                System.out.println("This loop runs "+ loopcount +" Times");
                break;
            }
            
            if(arr[n] < num)
                i = n;
            else if(arr[n] > num)
                a = n; 
            
                loopcount++;
        }


    }
}