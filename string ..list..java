import java.util.*;

public class string1{
    public static void main(String[] args) {   
        String[] str = {"string1" , "string2" , "string3" , "string4" ,"string5"};
        int[] arr = {1,2,3,4,56,8};
        List<String> list1 = Arrays.asList(str);
        List<String> list2 = Arrays.asList(str);

        System.out.println(list1);
        for(String s : list1){
            for(String s2 : list2){
                System.out.println("comparing " + s +" and " +s2);

                if(s == s2)
                System.out.println("1");
                else
                System.out.println("0");
            }
        }


    }

}