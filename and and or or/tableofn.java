import java.util.Scanner;
public class tableofn{
    public static void main(String[]arfss){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n;
        n = sc.nextInt();
        System.out.println("Multiplication of table of n :"+n);
        for(int i=1;i<=10;i++){
            System.out.println(n + " * " + i + " = " + n * i);
                            
        }


    }
}