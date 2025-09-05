// //display this a.p 4,7,10,13,16..upto 'n' terms.
import java.util.Scanner;
public class ap{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
         System.out.println("enter a intger :");
         int n;
         n = sc.nextInt();
//         //4 7 10 13 16... 3n+1 
//         for(int i=4;i<=3*n+1;i+=3){
//             System.out.println(i);
//         }

//     }
// }

//second method
int a=3,d=4;
for(int i=1;i<=n;i++){
    System.out.println(a+" ");
    a += d;              
}
    }
}
