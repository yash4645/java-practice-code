import java.util.Scanner;
// find area of triangle ,in which we used ternary operator
public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st side of triangle:");
        double a=sc.nextDouble();
        System.out.println("enter the 2st side of triangle:");
        double b=sc.nextDouble();
        System.out.println("enter the 3st side of triangle:");
        double c=sc.nextDouble();
        System.out.println( valid(a,b,c) ? "the area of the triangle is "+area(a,b,c) : "invalid numbers for triangle ");
    }
    public static boolean valid(Double a,Double b, Double c){
        if(a+b>c && b+c>a && c+a>b)
        return true;
        return false;
    }
    public static Double area(Double a,Double b,Double c){
        double areais=0;
        double s= (a+b+c)/2;
        areais=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return areais ;
    }
}
