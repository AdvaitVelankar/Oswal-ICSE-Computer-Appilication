import java.util.*;
public class Gifts
{
    public static void main()
    {
        double pa, d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your purchase amount");
        pa=sc.nextDouble();
        if(pa>=20000)
        {
            d=(0.25*pa);
            System.out.println("Your discount is:" +d);
            d=(pa-d);
            System.out.println("Your discounted value is" +d);
            System.out.println("Congratulation! \n Your Won an Anipod");
        }
        else if(pa<20000 && pa>=12000)
        {
            d=(0.2*pa);
            System.out.println("Your disount is:" +d);
            d=(pa-d);
            System.out.println("Your discounted value is" +d);
            System.out.println("Congratulation! \n Your Won an Wrist Watch");
        }
        else if(pa<12000 && pa>=5000)
        {
            d=(0.11*pa);
            System.out.println("Your discount is:" +d);
            d=(pa-d);
            System.out.println("Your discounted value is" +d);
            System.out.println("Congratulation! \n Your Won an Digital Table Clock");
        }
        else if(pa<5000)
        {
            d=(0.05*pa);
            System.out.println("Your discount is:" +d);
            d=(pa-d);
            System.out.println("Your discounted value is" +d);
            System.out.println("Congratulation! \n Your Won an Pen Set");
        }
        System.out.println("Any doubt please email on \n addyvelankar@gmail.com");
    }
}