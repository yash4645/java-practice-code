import java.util.*;
public class patternQ1{
    // pattterm for a  box 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of row for box: ");
        int r =sc.nextInt();
        System.out.println("enter the number of culmn for box");
        int c=sc.nextInt(); 
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

}