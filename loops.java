import java.util.*;;
public class loops {
    // code for for, while amd do while loop, for loop generally use when condition is given ,while loop generally use when condition is not given
    // lebel is use to specify which loop we want to continue or break 
    //code for find the number of digits in a given number
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter th enumber:  ");
        int n= sc.nextInt();
        int digit=0;
        while(n>0){
            n=n/10;
            digit++;
        }
        System.out.println("in the given number total digits is " +digit);
    }
    
}
