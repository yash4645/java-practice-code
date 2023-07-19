import java.util.Scanner;
//code for factorial of any number given by user;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        long num= sc.nextLong();
        long k = 1;
        if(num<0){
            System.out.println("invalid number ,plz enter greater then 0");
        }if(num>=0){
        for(long i= num;i>=1;i--){
            k = k*i;
        }
        System.out.println("factorial of " +num+ " is : "+k);
    }
    }  
}
