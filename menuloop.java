import java.util.*;
//code for taking marks from user and give him grade ,after ask for choice ,wants to continue or not if yes then repeat;

public class menuloop {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      // System.out.println("enter the choice ,either 1 or 0 :");
     //  int choice = sc.nextInt();
       int choice;
       do{
           System.out.println("enter marks");
           int marks= sc.nextInt();
           if(marks>=60 && marks <= 100){
               System.out.println("this is good");
           }
           else if(marks>=0 &&marks<=59){
               System.out.println("this is good as well as");
           }
           else {
               System.out.println("invalid");
           }
           System.out.println("choose choice 1 or 0");
           choice = sc.nextInt();
       }
       while(choice==1);
       
    } 
        
    
    
}
