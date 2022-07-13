import java.util.*;
public class Area
{
    public static void main()
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 for finding the area of square");
        System.out.println("Press 2 for finding the area of circle");
        System.out.println("Press 3 for finding the area of rectangle");
        ch=sc.next().charAt(0);
        switch(ch)
        {
            case '1':double s, a;
            System.out.println("Enter the length of side");
            s=sc.nextDouble();
            a=(4*s);
            System.out.println("Area of Square is" +a);
            break;
            case '2':double r;
            System.out.println("Enter the radius of circle");
            r=sc.nextDouble();
            a=(3.14*r);
            System.out.println("Area of circle is:" +a);
            break;
            case '3':double l, b;
            System.out.println("Enter Length");
            l=sc.nextDouble();
            System.out.println("Enter Breadth");
            b=sc.nextDouble();
            a=(l*b);
            System.out.println("Area of square is:"+a);
        }
    }
}