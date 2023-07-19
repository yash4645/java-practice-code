import java.util.*;
//code for calculater of two numbers ,taking from user:
public class calculator {
  public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1st number:");
    int a = sc.nextInt();
    System.out.println("enter 2nd number:");
    int b = sc.nextInt();
    System.out.println("write the no \n 1. addition \n 2. subtraction \n 3. multiplication \n 4. division");
    int cal = sc. nextInt();
    int sum = a+b;
    int sub = a-b;
    int mul = a*b;
    float div = a/b;
    // if (cal==1) {
    //     System.out.println("addition of a and b is "+ sum);
    // } else if (cal== 2) {
    //     System.out.println("subtraction of a and b is "+sub);
    // } else if (cal== 3) {
    //     System.out.println("multiplication of a and b is "+mul);
    // } else if (cal== 4) {
    //     System.out.println("division of a and b is "+div);
    // } else {
    //     System.out.println("wrong choice");
    //  }
           
    switch(cal){
        case 1->System.out.println(sum);
        case 2->System.out.println(sub);
        case 3->System.out.println(mul);
        case 4->System.out.println(div);
        default->System.out.println("wrong choice");
    }
}
    
}
