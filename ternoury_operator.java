import java.util.*;

public class ternoury_operator {
    // ternoury operator works similer to if else conditions,here this is the code for checking a number is odd or even
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the number to check even or odd");
        int num= sc.nextInt();
        String ans;
        ans= (num % 2==0) ?"even":"odd";
        System.out.println("given number "+num+" is "+ans);
    }
    
}
