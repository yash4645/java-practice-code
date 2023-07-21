import java.util.Scanner;

public class pentagonal {
    // code to write pentagonal number till given number
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the amount of numbers of pentagonal: ");
        int num=sc.nextInt();
        int count=1;
        for ( int i=1;i<=num;i++){
            System.out.printf("%-6d",getPentagonalNumber(i));
            if(count % 10==0)
            System.out.println();
            count++;
        }

    }
    public static int getPentagonalNumber(int i){
        return (i*(3*i-1))/2;
    }
}
