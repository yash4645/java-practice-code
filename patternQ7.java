import java.util.*;
public class patternQ7 {
    // code to print A B C D E
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the number of row ");
        int r=sc.nextInt();
        System.out.println(" enter the number of culmn ");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=i;j<=r;j++){
                System.out.print(j);
            
            System.out.println(" "); 
        }
        
    }
}
}
