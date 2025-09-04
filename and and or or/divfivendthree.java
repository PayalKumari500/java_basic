import java.util.Scanner;
public class divfivendthree{
    public static void main(String[]argss){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
        if(n%3==0 || n%5==0){
            System.out.println("the number is divisble by five or three :");
        }
        else{
            System.out.println("the number is not divisble by five or  three :");
        }

    }
}