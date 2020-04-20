package JavaTutorail2;

import java.util.*;
public class List1 {
    public static void main(String[] args) {
        String[] str = {"Bank" , "Deposit" , "Amount" , "Money"};
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();

        for (String s : str) {
            list1.add(s);
        }
        String[] st1 = {"Cop" , "Suger","Bank"};
        for (String s : st1) {
            list2.add(s);

        }
        int i ;
        int n = list1.size();
        for(i = 0 ; i < n ; i++)
        {
            System.out.printf("%s\n" , list1.get(i));
        }
        System.out.println();
        for (String s : list2) {
            System.out.println(s);
            
        }

        editlist(list1 , list2);
        System.out.println("\nEdit the list:");
        for (String s : list1) {
            System.out.println(s);
            
        }

    }
    public static void editlist(Collection<String> l1 , Collection<String> l2){
        Iterator<String> it = l1.iterator();
        while(it.hasNext()){
            if(l2.contains(it.next()))
                it.remove();
        }

    }

}












