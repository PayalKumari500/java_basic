import java.util.Scanner;
public class evenodd{
public static void main(String[]argss){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number :");
    int n = sc.nextInt();
    if(n%2==0){ //agr ye wali condition true hui tabhi code chalega
        System.out.println("the no is even :");
    }
    //if(n%2!=0){ jo ye condition nhi hai 
      //  System.out.println("the no is odd :");
    //}
    else{ //uske aalwa jo bhi hai kardo
        System.out.println("the no is odd :");
    }
}

}

