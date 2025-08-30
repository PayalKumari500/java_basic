import java.util.Scanner;
public class divisblebyfive{
    public static void main(String[]argss){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n;
        n = sc.nextInt();
        if(n%5==0){
            System.out.println("the number is dividble by 5 :");
        }
        else{
            System.out.println("the number is  not divisble by 5 :");
        }
    }
}