//wap to check if a no is composite or not.
import java.util.Scanner;
public class compositeno{
    public static void main(String[]srgs){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a integer :");
        int n = sc.nextInt();     
        for(int i=2;i<=n;i++){
            if(n%i==0){
                System.out.println("composite no :");
                break;                        

            }
          
            

        }
    }
}