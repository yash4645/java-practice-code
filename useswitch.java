import java.util.*;
//code for print the month name by given month number ,using switch ;
public class useswitch {
    public static void main(String arg []){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of month:");
        int month = sc.nextInt();
        switch(month){
        //     case 1 :
        //     System.out.println("month is january");
        //     break;
        //     case 2 :
        //     System.out.println("month is fabuary");
        //     break;
        //     case 3 :
        //     System.out.println("month is march");
        //     break;
        //     case 4 :
        //     System.out.println("month is april");
        //     break;
        //     case 5 :
        //     System.out.println("month is may");
        //     break;
        //     case 6 :
        //     System.out.println("month is june");
        //     break;
        //     case 7 :
        //     System.out.println("month is july");
        //     break;
        //     case 8 :
        //     System.out.println("month is august");
        //     break;
        //     case 9 :
        //     System.out.println("month is sptember");
        //     break;
        //     case 10 :
        //     System.out.println("month is octuber");
        //     break;
        //     case 11 :
        //     System.out.println("month is november");
        //     break;
        //     case 12 :
        //     System.out.println("month is december");
        //     break;
        //     default :
        //     System.out.println("invalid number...");
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Please enter a valid input!");
        }
    }
}