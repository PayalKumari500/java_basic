//given the length and breadth of a reactangle wap to find 
//wheather the area of the rectangle is greater than its parimeter

import java.util.Scanner;
public class greaterthanperimeter{
    public static void main(String[]argss){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length :");
        int length = sc.nextInt();
        System.out.println("enter breadth :");
        int breadth = sc.nextInt();
        int area = length*breadth;
        int perimeter = 2*(length+breadth);
        if(area>perimeter){
            System.out.println("area is greater than perimeter :");
        }
        if(perimeter>area){
            System.out.println("perimter is greater than area :");
        }
        if(area==perimeter){
            System.out.println("perimter and area are equal :");
        }
           
        }
    }
