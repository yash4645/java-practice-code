import java.util.*;
public class loopQ3 {
    // to print the reverse of the given number
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the number to do reverse : ");
       int n=sc.nextInt();
        String digit="";

         while(n>0){
             digit+=n%10;
             n=n/10;
         }
         System.out.println("the reverese of th egiven number is : "+ digit);
    // another method
    // int reverse=0;
    // while(n>0){
    //     reverse= (reverse*10)+(n%10);
    //     n=n/10;
    // }System.out.println(" reverse of the given number is : "+reverse);
    // in this method if we put 0 on last that will not be printed
    }
    
}
