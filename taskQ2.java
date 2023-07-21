import java.util.Scanner;
// find the distinct number in the given list

public class taskQ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total number of elements : ");
        int num=sc.nextInt();
        int arr []=new int[num];
        System.out.println("enter the elements of the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){   
                    arr[j]=-1;
                }
            }
            if(arr[i]!=-1){
                count++;
            }
        }
        System.out.println("total distinct number is : "+count);


        }
    }


