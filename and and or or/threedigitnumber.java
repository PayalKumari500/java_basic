import java.util.Scanner;
public class threedigitnumber{
    public static void main(String[]argss){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n;
        n = sc.nextInt();
        if(n>99 && n<1000){
            System.out.println("this is a three digit number :");
        }
        else{
            System.out.println("this is a not three digit number :");
        }
    }
}