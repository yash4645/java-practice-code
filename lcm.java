import java.util.*;
public class lcm{
    // lcm of 2 numbers
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the 1st number: ");
    int a=sc.nextInt();
    System.out.println("enter the 2nd number: ");
    int b=sc.nextInt();
    for(int i=1;i<=a*b;i++){
        if(i%a==0 && i%b==0){
            System.out.println("lcm of given number "+i);
            break;
        }
    }
 }   
}