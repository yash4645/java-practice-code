import java.util.*;
public class loopQ4 {
    // find the answer for the given series S=1-2+3-4...n
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n= sc.nextInt();   
        int sum=0;
        // int num=1;
        // while(num<=n){
        //     if(num%2==0)
        //         sum-=num;
        //     else
        //         sum+=num;
        //     num++;
        // }
        // by for loop
        for(int i=1;i<=n;i++){
            if(i%2==0)
                sum-=i;
            else
                sum+=i;
        }
        System.out.println("sum of the series is "+sum);
    }
    
}
