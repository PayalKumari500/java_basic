//take integer input and the absolute value of that integer
import java.util.Scanner;
public class absolute{
    public static void main(String[]argss){
         Scanner sc = new Scanner(System.in);
        System.out.println("enter any integer :");
        int n;
        n = sc.nextInt();
        if(n<0){
            n = n*(-1);
        }
        System.out.println("the entered number is absolute value :" +n);
    }
}
