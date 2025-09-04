//take 3 numbers input and tell if they can be sides of triangle
import java.util.Scanner;
public class sidesoftriangle{
    public static void main(String[]argss){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first side :");
        int a = sc.nextInt();
        System.out.println("enter second side :");
        int b = sc.nextInt();
        System.out.println("enter third side :");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && a+c>b){
            System.out.println("valid triangle :");
        }
        else{
            System.out.println("invalid trainle :");
        }
    }
}