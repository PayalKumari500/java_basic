import java.util.Scanner;
public class primeno{
    public static void main(String[]srgs){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a integer :");
        int n = sc.nextInt(); 
        boolean flag = false; //false means prime    
        for(int i=2;i<n;i++){
            if(n%i==0){ //i is factor of n
                flag = true; //true means composite 
                break;                        

            }
          
            

        }
        if(n==1)
          System.out.println(" neither prime nor composite no :");
        else if(flag==false)
          System.out.println("prime  no :");
          else
            System.out.println("composite no :");

    } 
}