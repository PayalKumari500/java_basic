//if cost price and selling price of an item is input through the 
//keyborad wap to determine whether the seller has made profit
//or incurred loss. also determine how much profit he 
//made or loss he incured.

import java.util.Scanner;
public class profitloss{
    public static void main(String[]arsg){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost price :");
        int cp;
        cp = sc.nextInt();
        System.out.println(" enter selling  price :");
        int sp;
        sp = sc.nextInt();
        if(cp>sp){
            System.out.println("loss :");
            System.out.  println(cp-sp);
        }
        if(sp>cp){
            System.out.println("profit :");
            System.out.println(sp-cp);
        }
          
    }
}