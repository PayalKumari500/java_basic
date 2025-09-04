//take 3 postive integers input and print the greatest of them
import java.util.Scanner;
public class greatestofthem{
    public static void main(String[]argss){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first integer :");
        int a = sc.nextInt();
        System.out.println("enter second integer :");
        int b = sc.nextInt();
        System.out.println("enter third integer :");
        int c = sc.nextInt();
        if(a>b && a>c){ // a is max
            System.out.println(a+"is largest :");
        }
        else if(b>a && b>c){ // b is max
            System.out.println(b+"is largest: ");
        }
        else(c>a && c>b){ //c has to be the largest
            System.out.println(c+"is largest :");
        }
        

 
    }
}
