import java.util.*;
public class sumOfDigits {
    // code for adding the given digits
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number between 0 to 1000 : ");
        int num=sc.nextInt();
        int sum=0;
        while(num!=0){
            sum+= num%10;
            num/=10;
        }
        System.out.println("sum of the integers is : "+sum);
    }
    
}
