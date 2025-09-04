import java.util.Scanner;
public class fivendthree{
    public static void main(String[]argss){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
        if(n%5==0 && n%3!=0){
            System.out.println("this number is divisble by five :");
        }
        else{
            System.out.println("this number is not divisvle by three :");

        }
    }
}