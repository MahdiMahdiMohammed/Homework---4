 import java.awt.*;
import java.util.Scanner;
public class n4 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        Rectangle b=new Rectangle();
        System.out.println("wilcome to tester ");
        System.out.println("Enter Height:");
        b.height=input.nextInt();
        System.out.println("enter the width :");
        b.width=input.nextInt();
        System.out.println("Enter x:");
        b.x= input.nextInt();
        System.out.println("enter the y:");
        b.y= input.nextInt();
        b.add(0,0);
        System.out.println("this height is (" +b.height+
                ")\n the width is (" +b.width +")\n the x is( " +b.x
                +")\n the y is (" +b.y+
                ")\n");

    }

}