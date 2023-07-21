import java.util.*;
public class patternQ3 {
    // triangle pattern
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row ");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for( int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println (" ");
        }
    }
    
}
