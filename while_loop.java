import java.util.*;;
public class while_loop {
    // sum of n numbers taking by user
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the number: ");
        int n=sc.nextInt();
        int sum=0;
        int num=1;
        while(num<=n ){
            sum=sum+num;
            num++;
        }
       System.out.println("sum of the number is "+sum);
    }
    
}
