import java.util.Scanner;
public class volumesphereinput{
    public static void main(String[]argsss){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a radius :");
        double radius;
        radius = sc.nextDouble();
        double pi = 3.1415;
        double sphere = (4*3.1415*radius*radius*radius/3);
        System.out.println("the volume of sphere is :" +sphere);
    }
}