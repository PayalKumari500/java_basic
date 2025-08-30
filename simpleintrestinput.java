import java.util.Scanner;
public class simpleintrestinput{
    public static void main(String[]argss){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter principal :");
        double principal;
        principal = sc.nextInt();
        System.out.println("enter rate :");
        double rate;
        rate = sc.nextInt();
        System.out.println("enter time :");
        double time;
        time = sc.nextInt();
        double si = (principal*rate*time)/100;
        System.out.println("the simple intrest is :" +si);
    }
}