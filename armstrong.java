public class armstrong {
    // to find all the 3 digits armstrong number ,write a function to find armstrong
    public static void main(String[] args) {

        for(int i=100;i<1000;i++){
            if(findArmstrong(i)){
                System.out.println(i);
            }
        }

        // boolean ans=findArmstrong(370);
        // System.out.println("the given number is armstrong "+ans);
        
    }

    static boolean findArmstrong(int n){
        int original=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n/=10;
            sum+=rem*rem*rem;
        }
        return sum==original;
    }
}
