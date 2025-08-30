import java.util.Scanner;
public class areaofcircleinput{
    public static void main(String[]argss){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter radius :");
        int radius;
        radius = sc.nextInt();
        double pi = 3.1415;
        double area = pi*radius*radius;
        System.out.println("the area of circle is :" +area);
    }
}