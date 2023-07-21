import java.util.Scanner;
//code for chake the given number is prime or not;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        boolean n = true;

        if( num<=1){
            System.out.println("neither prime nor composite ");
        }else{
            for(int i = 2; i*i<=num; i++){
                if(num % i ==0){
                    n= false;
                    break;
                }
            } 
            if(n){
                System.out.println("given number is a prime number ");
        }
        else{
            System.out.println("given number is composite number");        
        }
        }  
    }
    }

    

