import java.util.Scanner;

public class taskQ4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of mb numbers");
        int num=sc.nextInt();
        double arr []=new double[num];
        System.out.println("enter the mobile numbers: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextDouble();
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            while(arr[i]!=0){
                arr[i]/=10;
                count++;
            }
            if (count==10){
                System.out.println(" number is valid ");
                count=0;
            }
            if(count!=10){
                System.out.println(" number is not valid");
                count=0;
            }
        }
        
    }
}
