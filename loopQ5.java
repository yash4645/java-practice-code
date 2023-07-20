import java.util.*;
public class loopQ5 {
    // there are two given numbers a and b ,we have to find a to the power b
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the base number: ");
        int n= sc.nextInt(); 
        System.out.println(" enter the power number: ");
        int p=sc.nextInt();
        int num=1;
        for(int i=1;i<=p;i++){
           num*=n;
        }
        System.out.println(" total number is "+num);
    }
}
