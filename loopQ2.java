import java.util.*;
public class loopQ2 {
    // find the sum of all digits present in the number
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number : ");
        int n= sc.nextInt();
        int sum=0;
        while(n>0){
           sum+= n%10;
           n=n/10;
        }
        System.out.println("the addition of all digits given in the number is " +sum);
    }  
}
