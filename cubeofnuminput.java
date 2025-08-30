import java.util.Scanner;
public class cubeofnuminput{
    public static void main(String[]argss){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int a;
        a = sc.nextInt();
        int cube = a*a*a;
        System.out.println("the number of cube is :"+cube);
    }
}