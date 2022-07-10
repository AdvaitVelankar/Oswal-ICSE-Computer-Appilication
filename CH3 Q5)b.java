import java.util.*;
public class Discount_on_Cloths
{
    public static void main()
    {
        double C, DISC;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cost of cloths");
        C=sc.nextDouble();
        if(C<2000)
        {
            DISC=(C*0.15);
            System.out.println("Your Discount is:" +DISC);
        }
        else if(C>2000 && C<5000)
        {
            DISC=(C*0.25);
            System.out.println("Your Discount is:" +DISC);
        }
        else if(C>5001 && C<10000)
        {
            DISC=(C*0.35);
            System.out.println("Your Discount is:" +DISC);
        }
        else if(C>10000)
        {
            DISC=(C*0.5);
            System.out.println("Your Discount is:" +DISC);
        }
        else
        {
            System.out.println("ERROR");
        }
    }    
}
