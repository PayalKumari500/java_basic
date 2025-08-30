import java.util.Scanner; //jab user se input lenge to ye likhna jarrori hai
public class sumoftwonuminput{
    public static void main(String[]argss){
        Scanner sc = new Scanner(System.in); // similarly ye bhi
        System.out.println("enter a first number :"); // ye yese hi print ho jayega
        int x; // x name ka dabb abn gya usme jayega pahla no
        x = sc.nextInt(); // user se input lene tym ye likhte hai
        System.out.println("enter a second number :");
        int y;
        y = sc.nextInt();
        int sum = x+y; // sum name ka dabba bn jaega jisme saari calculation ho ajyei
        System.out.println("the number of sum is  :"+sum); // or ye print ho jayegi

    }
}