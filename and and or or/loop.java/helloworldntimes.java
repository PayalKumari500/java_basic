//print hello world 'n' times .take 'n' as input from user.

import java.util.Scanner;
public class helloworldntimes{
    public static void main(String[]arhs){
        Scanner sc = new Scanner(System.in);  
        System.out.println("enter a n :");
        int n = sc.nextInt();
        for(int i=1;i<=n;i=i+1){
            System.out.println("hello world :");
        }
    }
}