//take two integers input , a and b: a>b,and find the remainder
//when a is divided by b

import java.util.Scanner;
public class remianderinput{
    public static void main(String[]argss){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter dividend :");
        int a;
        a = sc.nextInt();
        System.out.println("enter divisor :");
        int b;
        b = sc.nextInt();
        int q= a/b;
        int r = a-(b*q);
        System.out.println("the remainder when "+a+" is dividend by "+b+" is "+r);
        



    }
}