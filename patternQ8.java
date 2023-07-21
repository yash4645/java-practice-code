import java.util.Scanner;

public class patternQ8 {
    // pattern to parallelogram by taking input as row and cullomn
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of height: ");
        int row=sc.nextInt();
        System.out.println("enter the number of width");
        int str=sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=str;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
