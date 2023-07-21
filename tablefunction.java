import java.util.Scanner;
//code for printing table using funtion & sum of the all numners 
public class tablefunction {
    public static void table(int a){
        int sum = 0;
        int ans = 1;
        if(a<=0){
            System.out.println("invalid number,plz write greater then  0:");
            return;
        }
        System.out.println("table of "+a+" is: ");
        for(int i= 1;i<=10;i++){
          ans = a*i;
          System.out.println(ans); 
            sum = sum + ans;
        } 
     System.out.println("sum is "+sum);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        table(a);
    }
    
}
