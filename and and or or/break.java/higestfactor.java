//wap find the highest factor of a number'n'(other than n itself)
// import java.util.Scanner;
// public class higestfactor{
//     public static void main(String[]arts){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a integer :");
//         int n;
//         n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             if(n%i==0)
//             System.out.println(i);
//         }
//     }
// }


import java.util.Scanner;
public class higestfactor{
    public static void main(String[]arts){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a integer :");
        int n;
        n = sc.nextInt();
        int hf = 1;
        for(int i=n-1;i>=1;i--){
            if(n%i==0) {
                hf = i;
                break;
            } 
        }
        System.out.println(hf);


        }
}