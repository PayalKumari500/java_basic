import java.util.Scanner;
public class divisblebyfiveandthree{
    public static void main(String[]argss){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n;
        n = sc.nextInt();
        if(n%5==0 && n%3==0){ //n%15==0 yese bhi ho sakta hai 
            System.out.println("this number is divisble by five and three :");
        }
        else{
            System.out.println("this number is not divisble by five and three : ");
        }
    }
    
}