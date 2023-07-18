
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// in this we are doing multiple operations on arraylist by repeating using do while loop
public class arraylist2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ArrayList<Integer> list = new ArrayList<>();
       int cont;
       do{
        System.out.println("enter the choice :\n 1. add \n 2. show element \n 3.edit element \n 4.delete element \n 5.show list");
        int choice= sc.nextInt();
        System.out.println("size of arraylist is " +list.size());
        int ind;
        int element;
        switch (choice){
            case 1 :
            // System.out.println("eneter the index:");
            // ind =sc.nextInt();
            System.out.println("enter the element:");
             element =sc.nextInt();
            list.add(element);
            System.out.println(element+" added");
            break;
            case 2:
            System.out.println("eneter the index:");
            ind =sc.nextInt();
            System.out.println(list.get(ind));
            break;
            case 3 :
            System.out.println("eneter the index:");
            ind =sc.nextInt();
            System.out.println("enter the element:");
            element =sc.nextInt();
            list.set(ind, element);
            break;
            case 4 :
            System.out.println("eneter the index:");
            ind =sc.nextInt();
            list.remove(ind);
            break;
            case 5:
             System.out.println(list);
             break;
        }
          System.out.println("enter 1 for continue:");
        cont = sc.nextInt();
     } while( cont == 1);
     System.out.println("our final arraylist is in sorted order :");
     Collections.sort(list);
     System.out.println(list);
    }
}
