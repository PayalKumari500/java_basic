import java.util.Scanner;
public class moduloopinput{
    public static void main(String[]argss){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter dividend :");
        int a;
        a = sc.nextInt();
        System.out.println("enter divisor :");
        int b;
        b = sc.nextInt();
        int r = a%b;
        System.out.println("the remainder when "+a+" is dividend by "+b+" is "+r);
        

    }
}


        