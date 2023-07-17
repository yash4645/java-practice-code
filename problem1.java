import java.util.*;
// java code for find the sum of the numbers between 1 to 1000
public class problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number between 0 to 1000 : ");
        int a=sc.nextInt();
        int sum=0;
        if(a>=0&& a<=1000){
            // for(int i=0;i<=a;i++){
            //     sum+=i;
            // }
            sum=a*(a+1)/2;
            System.out.println(" the number is : "+sum);
        }
        else{
            System.out.println("enter the number between 0 to 1000:");
        }
    }
    
}
