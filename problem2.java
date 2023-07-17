import java.util.Scanner;
// program to call a class by using object

class addOfNum{
     int add(int a,int b){
        int sum=a+b;
        return sum;
    }
}
public class problem2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        addOfNum ab=new addOfNum();
        System.out.println("enter the first number: ");
        int x=sc.nextInt();
        System.out.println("enter the second number: ");
        int b=sc.nextInt();
        int ans=ab.add(x, b);
        System.out.println(" addititon of the given numbers is: "+ans);
        System.out.println(Math.sqrt(ans));
        System.out.println(Math.ceil(6.5));
        System.out.println(Math.floor(6.5));
    }
}
