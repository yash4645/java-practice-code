import java.util.*;
public class patternQ4 {
    // piramid pattern
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number ");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            // for(int k=1;k<=2*i-1;k++){
            //     System.out.print("*");
            // }
            // another
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    
}
