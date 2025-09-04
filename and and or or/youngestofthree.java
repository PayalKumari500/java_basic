//if the ages of ram , shyam and ajya area input through the keyword
//wap to determine the youngest of them
import java.util.Scanner;
public class youngestofthree{
    public static void main(String[]argss){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ram age :");
        int a = sc.nextInt();
        System.out.println("enter shyam age :");
        int b = sc.nextInt();
        System.out.println("enter ajay age :");
        int c = sc.nextInt();
        if(a<b && a<c){
            System.out.println(a+"ram is youngest of them :");
        }
        else if(b<c && b<a){
            System.out.println(b+"shyam is youngest of them :");
        }
        else{
            System.out.println(c+"ajay is youngest of them :");
        }
    }
} 

