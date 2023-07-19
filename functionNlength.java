import java.util.Arrays;

public class functionNlength {
    public static void main(String[] args) {
        fun(23,45,67,89,34,23);
        mix(20,30,"yash","radhe","abcd" ,"dgysudf");
    }
    // this is variable length argument in which we can pass n number of argument as a parameter it will take it as an array

    static void fun(int...v){
       System.out.println(Arrays.toString(v));
    }

    static void mix(int a,int b,String...ab){
        System.out.println("integers is "+a+" "+b);
        System.out.println("array of string is "+Arrays.toString(ab));
    }
}
